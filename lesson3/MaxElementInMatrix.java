package lesson3;

import java.util.Arrays;

public class MaxElementInMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {11.2, 2.8, 34.5, 4.7, 5.7},
                {66.5, 77.7, 8, 9.5, 155.5}
        };
        double max = 0;
        System.out.println(Arrays.deepToString(matrix));
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (max < matrix[row][col]) {
                    max = matrix[row][col];
                }
            }
        }
        System.out.println(max);
    }
}
