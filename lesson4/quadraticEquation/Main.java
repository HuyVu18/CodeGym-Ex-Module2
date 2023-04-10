package lesson4.quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a:");
        double a = sc.nextDouble();
        System.out.println("Nhap b:");
        double b = sc.nextDouble();
        System.out.println("Nhap c:");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        System.out.println("Delta = " + equation.getDelta());

        if (equation.getDelta() > 0) {
            System.out.println("Root1 = ");
            System.out.println(equation.getRoot1());
            System.out.println("Root2 = ");
            System.out.println(equation.getRoot2());
        } else if (equation.getDelta() == 0) {
            System.out.println("Root = ");
            System.out.println(equation.getRoot1());
        } else {
            System.out.println("The equation no root");
        }


    }
}
