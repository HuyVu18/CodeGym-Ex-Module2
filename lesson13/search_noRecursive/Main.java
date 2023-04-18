package lesson13.search_noRecursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Search:");
        int key = sc.nextInt();
        if (BinarySearch.search(key) != -1) {
            System.out.println("Element " + BinarySearch.list[BinarySearch.search(key)] + " in Array and index " + BinarySearch.search(key));
        } else {
            System.out.println("Not Found!");
        }
    }
}
