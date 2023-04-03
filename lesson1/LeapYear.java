package lesson1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap nam muon tinh:");
        int y = input.nextInt();

        if (y % 400 == 0) {
            System.out.println("Day la nam nhuan.");
        } else if (y % 100 == 0) {
            System.out.println("Day khong phai nam nhuan");
        } else if (y % 4 == 0) {
            System.out.println("Day la nam nhuan.");
        } else {
            System.out.println("Day khong phai nam nhuan");
        }
    }
}
