package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;
import msa.lang.draw.domain.math.Vector2D;

public class SetPenPositionCommand implements DrawCommand {

    private Vector2D newPosition;

    public SetPenPositionCommand( double x, double y) {
        newPosition = new Vector2D(x,y);
    }

    @Override
    public void execute(Pen pen, Paper paper) {
        if (pen.getState() == Pen.State.DOWN)
        {
            paper.drawLine(pen, newPosition);
        }
        pen.setPosition(newPosition);
    }
}
