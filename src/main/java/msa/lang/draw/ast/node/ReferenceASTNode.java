package msa.lang.draw.ast.node;

public class ReferenceASTNode extends ExpressionASTNode {
    private final String id;

    public ReferenceASTNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
