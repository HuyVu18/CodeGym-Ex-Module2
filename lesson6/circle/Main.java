package lesson6.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0, "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(4.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.5, "blue", 6.5);
        System.out.println(cylinder);
    }
}
