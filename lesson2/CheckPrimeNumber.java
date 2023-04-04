package lesson2;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra");
        int num = input.nextInt();
        double num2 = Math.sqrt(num);
        boolean check = true;

        if (num % 1 == 0 && num > 0) {
            for (int i = 2; i <= num2; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (num == 1) {
                System.out.println(num + " k phai so nguyen to");
            } else if (check){
                System.out.println(num + " la so nguyen to");
            } else {
                System.out.println(num + " k phai so nguyen to");
            }
        }
    }
}
