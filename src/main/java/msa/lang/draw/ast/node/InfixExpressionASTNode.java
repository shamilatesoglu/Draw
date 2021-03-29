package msa.lang.draw.ast.node;

public class InfixExpressionASTNode extends ExpressionASTNode {
    private ExpressionASTNode left;
    private ExpressionASTNode right;

    private int operator;

    public InfixExpressionASTNode(ExpressionASTNode left, int operator, ExpressionASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ExpressionASTNode getLeft() {
        return left;
    }

    public ExpressionASTNode getRight() {
        return right;
    }

    public int getOperator() {
        return operator;
    }
}
