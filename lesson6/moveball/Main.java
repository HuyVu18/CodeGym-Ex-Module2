package lesson6.moveball;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(5.5f , 7.7f);
        System.out.println(point);
        System.out.println("---");

        MovablePoint pmove = new MovablePoint(2.2f, 4.4f, 3.3f, 8.8f);
        System.out.println(pmove);
        System.out.println(pmove.move());
    }
}
