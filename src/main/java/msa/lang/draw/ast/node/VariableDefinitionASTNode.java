package msa.lang.draw.ast.node;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeNode;

public class VariableDefinitionASTNode extends DrawAbstractSyntaxTreeNode {
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
