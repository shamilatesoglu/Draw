package msa.lang.draw.ast.node;

public class ForwardASTNode extends StatementASTNode {
    private final ExpressionASTNode expression;

    public ForwardASTNode(ExpressionASTNode expression) {
        this.expression = expression;
    }

    public ExpressionASTNode getExpression() {
        return expression;
    }
}
