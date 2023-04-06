package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang");
        int x = sc.nextInt();
        int[] arr = new int[x];

        System.out.println("Nhap tung phan tu");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Mang dao nguoc");

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[x - 1 - i];
            arr[x - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }




//    public static void main(String[] args) {
//        String[] arr = {"mm", "nn", "ll", "oo"};
//        System.out.println(Arrays.toString(arr));
//
//        List list = Arrays.asList(arr);
//        Collections.reverse(list);
//
//        String[] arrs = (String[])list.toArray(new String[3]);
//        System.out.println(Arrays.toString(arrs));
//    }
}


