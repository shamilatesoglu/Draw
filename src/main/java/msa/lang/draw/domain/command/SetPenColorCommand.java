package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;

public class SetPenColorCommand implements  DrawCommand{

    private int color;

    public SetPenColorCommand(int color) {
        this.color = color;
    }

    @Override
    public void execute(Pen pen, Paper paper) {
        pen.setColor(color);
    }
}
