package lesson3;

import java.util.Scanner;

public class ListStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten cua sv: ");
        String name = sc.nextLine();

        String[] student = {"trung", "vu", "phat", "phuoc", "huy"};
        int i = 0;

        for (; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println("Sv " + student[i] + " co trong ds. O vi tri " + i);
            }
        }
        if (i == student.length) {
            System.out.println("k co sv nay trong ds.");
        }

    }
}
