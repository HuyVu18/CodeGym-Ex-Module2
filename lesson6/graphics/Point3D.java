package lesson6.graphics;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] newfloat = new float[3];
        newfloat[0] = super.getX();
        newfloat[1] = super.getY();
        newfloat[2] = this.z;
        return newfloat;
    }

    @Override
    public String toString() {
        return "Point3D has "
                + Arrays.toString(getXYZ())
                + " and which is a subclass of "
                + super.toString();
    }
}
