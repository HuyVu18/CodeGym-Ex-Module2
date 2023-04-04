package lesson1;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can doc");
        int num = input.nextInt();
        int temp = num % 10;

        if (num >= 0 && num <= 10) {
            switch (num) {
                case 0:
                    System.out.println("khong");
                    break;
                case 1:
                    System.out.println("mot");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bon");
                    break;
                case 5:
                    System.out.println("nam");
                    break;
                case 6:
                    System.out.println("sau");
                    break;
                case 7:
                    System.out.println("bay");
                    break;
                case 8:
                    System.out.println("tam");
                    break;
                case 9:
                    System.out.println("chin");
                    break;
                case 10:
                    System.out.println("muoi");
                    break;
            }
        } else if (num > 20) {
            switch (num) {
                case 0:
                    System.out.println("khong");
                    break;
                case 1:
                    System.out.println("mot");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bon");
                    break;
                case 5:
                    System.out.println("nam");
                    break;
                case 6:
                    System.out.println("sau");
                    break;
                case 7:
                    System.out.println("bay");
                    break;
                case 8:
                    System.out.println("tam");
                    break;
                case 9:
                    System.out.println("chin");
                    break;
                case 10:
                    System.out.println("muoi");
                    break;
            }

        }


    }
}
