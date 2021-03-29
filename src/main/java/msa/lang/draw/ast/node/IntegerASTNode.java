package msa.lang.draw.ast.node;

public class IntegerASTNode extends NumberASTNode {
    private final Integer value;

    public IntegerASTNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
