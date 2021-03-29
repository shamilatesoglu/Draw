package msa.lang.draw.ast.node;

public class PaperDeclarationASTNode extends StatementASTNode {
    private final ExpressionASTNode widthExpression;
    private final ExpressionASTNode heightExpression;

    public PaperDeclarationASTNode(ExpressionASTNode widthExpression, ExpressionASTNode heightExpression) {
        this.widthExpression = widthExpression;
        this.heightExpression = heightExpression;
    }

    public ExpressionASTNode getWidthExpression() {
        return widthExpression;
    }

    public ExpressionASTNode getHeightExpression() {
        return heightExpression;
    }
}
