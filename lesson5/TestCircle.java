package lesson5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, "red");
        Circle circle2 = new Circle();

        System.out.println(circle1.getRadius() + " " + circle1.getColor());
        System.out.println(circle2.getRadius() + " " + circle2.getColor());
    }

}

class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}