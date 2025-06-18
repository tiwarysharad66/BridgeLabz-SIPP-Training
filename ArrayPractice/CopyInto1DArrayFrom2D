package Day4;

import java.util.Scanner;
import java.util.*; // For Arrays utility class

public class CopyInto1DArrayFrom2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking input for number of rows and columns
        int rows = s.nextInt();
        int cols = s.nextInt();

        // Declaring a 2D array (matrix) with the given dimensions
        int[][] matrix = new int[rows][cols];

        // Reading input elements into the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        // Declaring a 1D array to store all elements from the 2D array
        int[] Array = new int[rows * cols];

        int p = 0; // Pointer for the 1D array

        // Copying elements from 2D array to 1D array in row-major order
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Array[p++] = matrix[i][j];
            }
        }

        // Printing the 1D array using Arrays.toString() for easy visualization
        System.out.println(Arrays.toString(Array));
    }
}
