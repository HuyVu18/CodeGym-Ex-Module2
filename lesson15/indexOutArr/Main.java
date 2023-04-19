package lesson15.indexOutArr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = createRandom.random();
        Scanner sc = new Scanner(System.in);

        System.out.println(Arrays.toString(arr));
        System.out.println("Input index:");
        int x = sc.nextInt();

        try {
            System.out.println("Index " + x + " is value " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your Index is out Array size!!!");
        }
    }
}
