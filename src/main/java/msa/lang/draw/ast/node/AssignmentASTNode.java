package msa.lang.draw.ast.node;

public class AssignmentASTNode extends StatementASTNode {
    private final String identifier;
    private final ExpressionASTNode expression;

    public AssignmentASTNode(String identifier, ExpressionASTNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionASTNode getExpression() {
        return expression;
    }
}
