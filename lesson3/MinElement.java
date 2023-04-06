package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Input element of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays: " + Arrays.toString(arr));
        System.out.println("min element in array is " + minValua(arr));
    }

    public static int minValua (int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
