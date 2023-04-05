package lesson3;

import java.util.Scanner;
import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua mang");
        int x = sc.nextInt();
        int[] arr = new int[x];
        int xmax = arr[0];
        for (int i = 0; i < x; i++) {
            System.out.println("nhap so thu " + (i + 1));
            arr[i] = sc.nextInt();
            if (xmax < arr[i]) {
                xmax = arr[i];
            }
        }
        System.out.println("Mang bao gom " + Arrays.toString(arr) + " co phan tu lon nhat la " + xmax);
    }
}
