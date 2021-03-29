package msa.lang.draw.ast.node;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeNode;

public class ReferenceASTNode extends DrawAbstractSyntaxTreeNode {
    private final String id;

    public ReferenceASTNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
