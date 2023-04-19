package lesson14.selectionSort;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort() {
        int n = list.length;
        for (int i = 0; i < n -1; i++) {
            int min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[min] > list[j]) {
                    min = j;
                }
            }

            if (min != i) {
                double temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }
}
