package msa.lang.draw.ast.node;

public class MoveASTNode extends StatementASTNode {
    private final ExpressionASTNode dxExpression;
    private final ExpressionASTNode dyExpression;

    public MoveASTNode(ExpressionASTNode dxExpression, ExpressionASTNode dyExpression) {
        this.dxExpression = dxExpression;
        this.dyExpression = dyExpression;
    }

    public ExpressionASTNode getDxExpression() {
        return dxExpression;
    }

    public ExpressionASTNode getDyExpression() {
        return dyExpression;
    }
}
