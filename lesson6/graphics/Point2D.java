package lesson6.graphics;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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
        return "Point2D has "
                + Arrays.toString(getXY());
    }
}
