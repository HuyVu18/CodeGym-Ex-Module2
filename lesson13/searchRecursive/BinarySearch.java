package lesson13.searchRecursive;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static final int notFound = -1;

    public static int search(int left, int right, int key) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (key == list[mid])
                return mid;
            if (key < list[mid])
                return search(left, mid - 1, key);
            if (key > list[mid])
                return search(mid + 1, right, key);
        }
        return notFound;
    }
}
