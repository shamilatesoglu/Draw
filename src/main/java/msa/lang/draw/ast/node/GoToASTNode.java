package msa.lang.draw.ast.node;

public class GoToASTNode extends StatementASTNode {
    private final ExpressionASTNode xExpression;
    private final ExpressionASTNode yExpression;
    public GoToASTNode(ExpressionASTNode xExpression, ExpressionASTNode yExpression) {
        this.xExpression = xExpression;
        this.yExpression = yExpression;
    }

    public ExpressionASTNode getXExpression() {
        return xExpression;
    }

    public ExpressionASTNode getYExpression() {
        return yExpression;
    }
}
