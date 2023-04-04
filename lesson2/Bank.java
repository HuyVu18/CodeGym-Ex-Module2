package lesson2;

import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("So tien vay");
        int money = input.nextInt();

        System.out.println("Lai suat");
        double rate = input.nextDouble();

        System.out.println("Thoi han");
        int m = input.nextInt();

        System.out.println("Tien lai");
        double l = money * m * (rate / 100) / 12;
        System.out.println(l);




    }
}
