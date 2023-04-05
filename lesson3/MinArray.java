package lesson3;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {5, 73, 9, 10, 25};
        int value = minValua(arr);
        System.out.println("minarr = " + value);
    }

    public static int minValua (int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
