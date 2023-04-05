package lesson3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        double c;
        int action = 3;
        while (action != 0) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            action = sc.nextInt();
            switch (action) {
                case 1 -> {
                    System.out.println("Enter Fahrenheit: ");
                    f = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToc(f));
                }
                case 2 -> {
                    System.out.println("Enter Celsius: ");
                    c = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cTof(c));
                }
                case 0 -> System.exit(0);
                default -> System.out.println("No action.");
            }
        }
    }
    public static double cTof(double c) {
        double f = c * 1.8 + 32;
        return f;
    }
    public static double fToc(double f) {
        double c = (f - 32) * 0.555;
        return c;
    }


}
