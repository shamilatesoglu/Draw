package msa.lang.draw.ast.node;

public class AssignmentASTNode extends StatementASTNode {
    private final ReferenceASTNode reference;
    private final ExpressionASTNode expression;

    public AssignmentASTNode(ReferenceASTNode reference, ExpressionASTNode expression) {
        this.reference = reference;
        this.expression = expression;
    }

    public ReferenceASTNode getReference() {
        return reference;
    }

    public ExpressionASTNode getExpression() {
        return expression;
    }
}
