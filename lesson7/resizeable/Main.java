package lesson7.resizeable;

import lesson6.geometry.Circle;
import lesson6.geometry.Rectangle;
import lesson6.geometry.Square;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        System.out.println("Pre-resize");
        System.out.println(c.getPerimeter());
        System.out.println("After-resize");
        System.out.println(c.resize());

        System.out.println("Pre-resize");
        System.out.println(r.getPerimeter());
        System.out.println("After-resize");
        System.out.println(r.resize());

        System.out.println("Pre-resize");
        System.out.println(s.getPerimeter());
        System.out.println("After-resize");
        System.out.println(s.resize());
    }
}
