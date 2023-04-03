package lesson1;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner input = new Scanner(System.in);
        System.out.println("a: ");
        double a = input.nextDouble();

        System.out.println("b: ");
        double b = input.nextDouble();

        System.out.println("c: ");
        double c = input.nextDouble();

        if (a != 0) {
            double result = (c - b) / a;
            System.out.println("Equation pass with x = " + result);
        } else {
            if (b == c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }

    }
}
