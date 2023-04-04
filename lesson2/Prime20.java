package lesson2;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;

        for (int i = 2; i < 1000; i++) {
            Boolean check = true;
            if (num > count) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                    }
                }
                if (check) {
                    count += 1;
                    System.out.println(i);
                }
            }
        }
    }
}

