package lesson1;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("Nhap thang muon tinh ngay: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Thang nay co 31 ngay.");
            case 2 -> System.out.println("Thang nay co 28 hoac 29 ngay.");
            case 4, 6, 9, 11 -> System.out.println("Thang nay co 30 ngay.");
            default -> System.out.println("Thang trong nam tu 1 - 12");
        }
    }
}
