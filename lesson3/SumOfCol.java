package lesson3;

import java.util.Scanner;

public class SumOfCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = {
                {11.2, 2.8, 34.5, 4.7, 5.7},
                {66.5, 77.7, 8, 9.5, 155.5},
                {76.2, 7.4, 81.7, 39.4, 5.5}
        };
        System.out.println("Column sum");
        int col = sc.nextInt();
        double sum = 0;
        if (col < matrix[0].length) {
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            System.out.println("Sum of Column " + sum);
        } else {
            System.out.println("Column so big with matrix");
        }
    }
}
