package lesson14.insertionSort;

public class InsertionSort {
    public static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSort() {

        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int index = i;
            while (index > 0 && x < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = x;
        }
    }
}
