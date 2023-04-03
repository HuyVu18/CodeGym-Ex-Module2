package lesson1;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("Nhap thang muon tinh ngay: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang nay co 31 ngay.");
                break;

            case 2:
                System.out.println("Thang nay co 28 hoac 29 ngay.");
                break;

            default:
                System.out.println("Thang nay co 30 ngay.");
        }
    }
}
