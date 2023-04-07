package lesson4.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort obj = new SelectionSort();
        StopWatch watch = new StopWatch();
        watch.start();

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        obj.sort(arr);

        watch.stop();
        System.out.println("Sorted array");
        obj.prinArray(arr);
        System.out.println("Time elapsed = " + watch.getElapsedTime());

    }
}
