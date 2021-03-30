package msa.lang.draw.ast.node;

public class TurnASTNode extends StatementASTNode{
    private final ExpressionASTNode degreesExpression;

    public TurnASTNode(ExpressionASTNode degreesExpression) {
        this.degreesExpression = degreesExpression;
    }

    public ExpressionASTNode getDegreesExpression() {
        return degreesExpression;
    }
}
