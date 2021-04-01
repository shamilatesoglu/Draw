package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;
import msa.lang.draw.domain.math.Vector2D;

public class MovePenCommand implements DrawCommand {
    private final double dX;
    private final double dY;

    public MovePenCommand(double dX, double dY) {
        this.dX = dX;
        this.dY = dY;
    }

    @Override
    public void execute(Pen pen, Paper paper) {
        Vector2D newPos = pen.getPosition().getAdded(new Vector2D(dX, dY));
        if (pen.getState() == Pen.State.DOWN)
        {
            paper.drawLine(pen, newPos);
        }
        pen.setPosition(newPos);
    }
}
