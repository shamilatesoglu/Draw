package msa.lang.draw.ast.node;

public class MathFunctionCallASTNode extends ExpressionASTNode {
    private final String functionName;
    private final ExpressionASTNode argument;

    public MathFunctionCallASTNode(String functionName, ExpressionASTNode argument) {
        this.functionName = functionName;
        this.argument = argument;
    }

    public String getFunctionName() {
        return functionName;
    }

    public ExpressionASTNode getArgument() {
        return argument;
    }
}
