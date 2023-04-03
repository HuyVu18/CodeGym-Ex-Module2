package lesson1;

import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap can nang");
        double w = input.nextDouble();

        System.out.println("Nhap chieu cao");
        double h = input.nextDouble();

        double bmi = w / (h * h);

        if (bmi < 18.5) {
            System.out.println("Gay");
        } else if (bmi < 25.0) {
            System.out.println("Binh thuong");
        } else if (bmi < 30.0) {
            System.out.println("Nang");
        } else {
            System.out.println("Beo");
        }
    }
}
