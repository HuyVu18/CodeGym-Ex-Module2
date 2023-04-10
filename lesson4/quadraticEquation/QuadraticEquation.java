package lesson4.quadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return ((- this.b) + Math.sqrt(getDelta())) / (2 * this.a);
    }

    public double getRoot2() {
        return ((- this.b) - Math.sqrt(getDelta())) / (2 * this.a);
    }
}
