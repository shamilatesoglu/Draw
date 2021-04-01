package msa.lang.draw;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeBuilder;
import msa.lang.draw.ast.node.CompilationUnitASTNode;
import msa.lang.draw.cst.DrawLexer;
import msa.lang.draw.cst.DrawParser;
import msa.lang.draw.runtime.ExecutorASTVisitor;
import msa.lang.draw.utils.FileUtils;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class DrawInterpreter {

    public static void executeAll(String source, OutputStream out) {
        // Lexical Analysis
        DrawLexer lexer = new DrawLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DrawParser parser = new DrawParser(tokenStream);
        DrawParser.CompilationUnitContext cst = parser.compilationUnit();

        CompilationUnitASTNode root = (CompilationUnitASTNode) new DrawAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);

        ExecutorASTVisitor executor = new ExecutorASTVisitor();
        executor.visit(root);

        try {
            executor.getPaper().print(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void executeAll(String source) {
        try {
            PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8");
            executeAll(source, out);
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM does not support mandatory encoding UTF-8");
        }
    }

    public static void main(String[] args) {

        ArgumentParser parser = ArgumentParsers.newFor("Draw").build()
                .defaultHelp(true)
                .description("An interpreter for Draw, a LOGO-like DSL for drawing.");
        parser.addArgument("-f", "--file")
                .help("The file that contains the code to be interpreted");
        parser.addArgument("-o", "--out") 
                .setDefault("output.png")
                .help("Output file path");
        Namespace ns = null;

        try {
            ns = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        String filePath = ns.getString("file");
        String source = FileUtils.readString(filePath);

        String outputPath = ns.getString("out");

        try {
            OutputStream out = new FileOutputStream(outputPath);
            executeAll(source, out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
