package msa.lang.draw.ast.node;

public class VariableDefinitionASTNode extends StatementASTNode {
    private final String name;
    private final ExpressionASTNode expression;

    public VariableDefinitionASTNode(String name, ExpressionASTNode expression) {
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public ExpressionASTNode getExpression() {
        return expression;
    }
}
