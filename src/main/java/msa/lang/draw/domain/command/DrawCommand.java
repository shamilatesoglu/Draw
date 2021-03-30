package msa.lang.draw.domain.command;

import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;

public interface DrawCommand {


    void execute(Pen pen, Paper paper);

}
