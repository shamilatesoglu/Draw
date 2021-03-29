package msa.lang.draw.ast.node;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeNode;


public class NegationASTNode extends ExpressionASTNode {
    private final ExpressionASTNode innerNode;

    public NegationASTNode(ExpressionASTNode innerNode) {
        this.innerNode = innerNode;
    }

    public ExpressionASTNode getInnerNode() {
        return innerNode;
    }

}
