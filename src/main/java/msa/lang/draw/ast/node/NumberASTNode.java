package msa.lang.draw.ast.node;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeNode;

public class NumberASTNode extends DrawAbstractSyntaxTreeNode {
    private final Double value;

    public NumberASTNode(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
