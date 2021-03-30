package msa.lang.draw.domain;

import msa.lang.draw.domain.math.Vector2D;

public class Pen {
    public enum State {
        UP, DOWN
    }

    private double orientation;

    private Vector2D position;

    private int color;

    private float width;

    private State state;

    public Pen() {

        position = new Vector2D(0,0);

        orientation = 0.0;

        width = 1.0f;

        color = 0xffffff;

        state = State.UP;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getOrientation() {
        return orientation;
    }

    public Vector2D getPosition() {
        return position;
    }

    public int getColor() {
        return color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
