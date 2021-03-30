package msa.lang.draw;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeBuilder;
import msa.lang.draw.ast.node.CompilationUnitASTNode;
import msa.lang.draw.cst.DrawLexer;
import msa.lang.draw.cst.DrawParser;
import msa.lang.draw.domain.DrawCommandQueue;
import msa.lang.draw.runtime.ExecutorASTVisitor;
import msa.lang.draw.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Scanner;

public class DrawInterpreter {

    public static void executeAll(String source, PrintStream out) {
        // Lexical Analysis
        DrawLexer lexer = new DrawLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DrawParser parser = new DrawParser(tokenStream);
        DrawParser.CompilationUnitContext cst = parser.compilationUnit();

        CompilationUnitASTNode root = (CompilationUnitASTNode) new DrawAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);

        ExecutorASTVisitor executor = new ExecutorASTVisitor();
        executor.visit(root);

        DrawCommandQueue commandQueue = executor.getCommandQueue();

        commandQueue.executeAll();

        try {
            commandQueue.getPaper().print(new File("output.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press enter key to terminate...");
        scanner.nextLine();


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
        String filepath = args[0];

        String source = FileUtils.readString(filepath);

        executeAll(source);
    }

}
