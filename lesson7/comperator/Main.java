package lesson7.comperator;

import lesson6.geometry.Circle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(2.8);
        circles[2] = new Circle("blue", false, 1.9);

        System.out.println("Pre-sort:");
        for (Circle e : circles) System.out.println(e);

        Comperator comperatorCirle = new Comperator();
        Arrays.sort(circles, comperatorCirle);

        System.out.println("After-sort:");
        for (Circle e : circles) System.out.println(e);

    }
}
