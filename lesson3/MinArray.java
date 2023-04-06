package lesson3;

import java.util.Arrays;
import java.util.Scanner;
public class MinArray {
    public static void main(String[] args) {
        int[] arr = {5, 73, 9, 10, 25};
        System.out.println("minarr = " + minValua(arr));
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
