package lesson3;

import java.util.Arrays;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean check = false;

        System.out.println("Nhap gtri them");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (n == i) {
                check = true;
                for (i = arr.length - 1; i > n; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[n] = x;
            }
        }
        if (check) {
            System.out.println("Mang moi da them");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("vi tri nhap qua kich thuoc mang");
        }
    }
}
