package lesson15.illegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side 1:");
        double a = sc.nextDouble();
        System.out.println("Input side 2:");
        double b = sc.nextDouble();
        System.out.println("Input side 3:");
        double c = sc.nextDouble();

        try {
            if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
                throw new TriangleException();
            }
            System.out.println("This is a Triangle.");
        } catch (TriangleException e) {
            System.err.println(e.getMessage());
        }

    }
}
