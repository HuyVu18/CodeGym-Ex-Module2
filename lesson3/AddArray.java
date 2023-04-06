package lesson3;

import java.util.Arrays;
public class AddArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr3));
        for (int i = arr1.length; i < arr3.length; i++) {
                arr3[i] = arr2[i - arr1.length];
        }
        System.out.println(Arrays.toString(arr3));
    }

}
