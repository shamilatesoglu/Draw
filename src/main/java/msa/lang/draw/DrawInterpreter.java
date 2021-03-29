package msa.lang.draw;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeBuilder;
import msa.lang.draw.ast.node.CompilationUnitASTNode;
import msa.lang.draw.cst.DrawLexer;
import msa.lang.draw.cst.DrawParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class DrawInterpreter {

    public static void executeAll(String source, PrintStream out) {
        // Lexical Analysis
        DrawLexer lexer = new DrawLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DrawParser parser = new DrawParser(tokenStream);
        DrawParser.CompilationUnitContext cst = parser.compilationUnit();

        CompilationUnitASTNode root = (CompilationUnitASTNode) new DrawAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);


        //// Semantic Analysis
        //SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
        //semanticAnalyser.visit(root);

        //// Interpretation
        //AutoComputeInterpreter interpreter = new AutoComputeInterpreter(semanticAnalyser.getSymbolTable(), semanticAnalyser.getScopeGraph(), out);
        //interpreter.interpret(root);
    }

    public static void executeAll(String source) {
        try {
            PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8");
            executeAll(source, out);
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM does not support mandatory encoding UTF-8");
        }
    }

}
