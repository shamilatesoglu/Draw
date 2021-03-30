package msa.lang.draw.domain;

import msa.lang.draw.domain.command.DrawCommand;

import java.util.ArrayDeque;
import java.util.Queue;

public class DrawCommandQueue {

    private Queue<DrawCommand> queue;

    private final Pen pen;
    private final Paper paper;

    public DrawCommandQueue(Pen pen, Paper paper) {
        queue = new ArrayDeque<>();

        this.pen = pen;
        this.paper = paper;
    }

    public void enqueue(DrawCommand command) {
        queue.add(command);
    }

    /**
     * Executes commands one by one.
     * @return True if last item in the queue is cleared.
     */
    public boolean execute() {
        if (queue.isEmpty()) return true;

        DrawCommand command = queue.poll();
        command.execute(pen, paper);

        return false;
    }

    public void executeAll() {
        boolean isEmpty = false;
        while (!isEmpty) {
            isEmpty = execute();
        }
    }

    public Pen getPen() {
        return pen;
    }

    public Paper getPaper() {
        return paper;
    }
}
