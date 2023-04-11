package lesson6.moveball;

import java.util.Arrays;

public class Point {
    protected float x;
    protected float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] newfloat = new float[2];
        newfloat[0] = this.x;
        newfloat[1] = this.y;
        return newfloat;
    }

    @Override
    public String toString() {
        return "Point has "
                + Arrays.toString(getXY());
    }
}
