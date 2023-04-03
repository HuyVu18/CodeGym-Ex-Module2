package lesson1;

import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("USD");
        double u = input.nextDouble();

        System.out.println("VND");
        double v = u * 23000;
        System.out.println(v);
    }
}
