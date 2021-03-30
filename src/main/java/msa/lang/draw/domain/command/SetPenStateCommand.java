package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;

public class SetPenStateCommand  implements DrawCommand{

    private final Pen.State newState;

    public SetPenStateCommand(Pen.State newState) {
        this.newState = newState;
    }

    @Override
    public void execute(Pen pen, Paper paper) {
        pen.setState(newState);
    }
}
