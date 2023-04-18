package lesson13.search_noRecursive;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    Scanner sc = new Scanner(System.in);
    private static final int notFound = -1;

    static int search(int key) {
        int left = 0;
        int right = list.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == list[mid])
                return mid;
            if (key < list[mid])
                right = mid - 1;
            if (key > list[mid])
                left = mid + 1;
        }
        return notFound;
    }
}
