package msa.lang.draw.ast.node;

public class SetPenStateASTNode extends StatementASTNode {
    public enum PenState {
        UP, DOWN
    }

    private final PenState state;

    public SetPenStateASTNode(PenState state) {
        this.state = state;
    }
}
