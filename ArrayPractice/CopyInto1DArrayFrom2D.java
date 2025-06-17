package Day4;

import java.util.Scanner;
import java.util.*;

public class CopyInto1DArrayFrom2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
       int [][] matrix = new int[rows][cols];
       for(int i = 0;i<matrix.length;i++){
           for (int j = 0; j< matrix[0].length ; j++) {
               matrix[i][j]= s.nextInt();
           }
       }
       int []Array = new int[rows*cols];
       int p=0;
       for(int i = 0;i< matrix.length;i++){
           for(int j = 0;j<matrix[0].length;j++){
               Array[p++] = matrix[i][j];
           }
       }
   System.out.println(Arrays.toString(Array));
    }
}
