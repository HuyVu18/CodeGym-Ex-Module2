package lesson3;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num of student");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;

        if (size < 30) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Student " + (i + 1));
                arr[i] = sc.nextInt();
            }
        } else {
            System.out.println("Num is big not check!");
        }

        System.out.println("List student pass");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] < 10) {
                System.out.println("Student " + (i + 1) + " has point pass: " + arr[i]);
                count++;
            }
        }
        System.out.println("Num of student pass is " + count);
    }
}
