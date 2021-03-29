package msa.lang.draw.ast.node;

public class SetPenColorASTNode extends StatementASTNode {
    private final ExpressionASTNode colorExpression;

    public SetPenColorASTNode(ExpressionASTNode colorExpression) {
        this.colorExpression = colorExpression;
    }

    public ExpressionASTNode getColorExpression() {
        return colorExpression;
    }
}
