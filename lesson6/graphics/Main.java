package lesson6.graphics;

public class Main {
    public static void main(String[] args) {
        Point2D p2D = new Point2D();
        System.out.println(p2D);

        p2D = new Point2D(5.5f, 7.9f);
        System.out.println(p2D);
        System.out.println("---");

        Point3D p3D = new Point3D(10.0f);
        System.out.println(p3D);

        p3D = new Point3D(19.1f, 28.3f, 18.8f);
        System.out.println(p3D);
    }
}
