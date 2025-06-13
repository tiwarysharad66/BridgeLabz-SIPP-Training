package Day1;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int sum = (num1+num2+num3);
        int average = sum/3;
        System.out.println(average);
    }
}
