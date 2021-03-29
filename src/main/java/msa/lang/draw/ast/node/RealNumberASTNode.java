package msa.lang.draw.ast.node;

public class RealNumberASTNode extends NumberASTNode{
    private final Double value;

    public RealNumberASTNode(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
