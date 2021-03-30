package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;

public class TurnDirectionCommand  implements DrawCommand{

    private final double degrees;

    public TurnDirectionCommand(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public void execute(Pen pen, Paper paper) {
        pen.setOrientation(pen.getOrientation() + degrees);
    }
}
