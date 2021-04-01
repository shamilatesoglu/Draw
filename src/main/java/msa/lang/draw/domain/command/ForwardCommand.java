package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;
import msa.lang.draw.domain.math.Vector2D;

public class ForwardCommand implements DrawCommand{

    private final double units;

    public ForwardCommand(double units) {
        this.units = units;
    }

    @Override
    public void execute(Pen pen, Paper paper) {
        Vector2D addition = new Vector2D(units, 0);
        addition.rotateBy(Math.toRadians(pen.getOrientation()));
        Vector2D newPos = pen.getPosition().getAdded(addition);
        if (pen.getState() == Pen.State.DOWN) {
            paper.drawLine(pen, newPos);
        }
        pen.setPosition(newPos);
    }
}
