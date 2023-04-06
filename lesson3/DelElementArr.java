package lesson3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DelElementArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap so muon xoa");
        int a = sc.nextInt();
        Boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                check = true;
                for (; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        if (check) {
            System.out.println("Mang da xoa so");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("So khong nam trong mang");
        }


//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        System.out.println(arr);
//        System.out.println("nhap so can xoa");
//        int x = sc.nextInt();
//        int i = 0;
//        for (; i < arr.size(); i++) {
//            if (x == arr.get(i)) {
//                arr.remove(i);
//            }
//        }
//        if (i == arr.size()) {
//            System.out.println("So khong nam trong mang");
//        }
//        System.out.println(arr);
    }
}
