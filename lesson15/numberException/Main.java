package lesson15.numberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input x: ");
        int x = sc.nextInt();

        System.out.println("Input y: ");
        int y = sc.nextInt();
        Calc.calculate(x, y);
    }
}
