package lesson3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class DelElementArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        System.out.println("nhap so can xoa");
        int x = sc.nextInt();
        int i = 0;
        for (; i < arr.size(); i++) {
            if (x == arr.get(i)) {
                arr.remove(i);
            }
        }
        if (i == arr.size()) {
            System.out.println("So khong nam trong mang");
        }
        System.out.println(arr);


    }
}
