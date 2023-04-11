package lesson6.moveball;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] newfloat = new float[2];
        newfloat[0] = this.xSpeed;
        newfloat[1] = this.ySpeed;
        return newfloat;
    }

    public MovablePoint move() {
        super.x += this.xSpeed;
        super.y += this.ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return  super.toString()
                + " and speed "
                + Arrays.toString(getSpeed());
    }
}
