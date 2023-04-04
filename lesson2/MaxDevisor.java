package lesson2;

import java.util.Scanner;

public class MaxDevisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = input.nextInt();
        a = Math.abs(a);

        System.out.println("Nhap so b");
        int b = input.nextInt();
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Khong co UCLN");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("UCLN la: " + a);
        }
    }
}
