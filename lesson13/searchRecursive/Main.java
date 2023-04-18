package lesson13.searchRecursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Search:");
        int key = sc.nextInt();
        int search1 = BinarySearch.search(0, BinarySearch.list.length - 1, key);
        if (search1 != BinarySearch.notFound) {
            System.out.println("Element " + BinarySearch.list[search1] + " in Array and index " + search1);
        } else {
            System.out.println("Not Found!");
        }
    }
}
