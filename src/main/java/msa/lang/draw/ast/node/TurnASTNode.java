package msa.lang.draw.ast.node;

public class TurnASTNode extends StatementASTNode{
    public enum Direction {
        RIGHT, LEFT
    }

    private final Direction direction;
    private final ExpressionASTNode degreesExpression;

    public TurnASTNode(Direction direction, ExpressionASTNode degreesExpression) {
        this.direction = direction;
        this.degreesExpression = degreesExpression;
    }

    public Direction getDirection() {
        return direction;
    }

    public ExpressionASTNode getDegreesExpression() {
        return degreesExpression;
    }
}
