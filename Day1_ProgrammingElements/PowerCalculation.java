package Day1;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
       double power =  Math.pow(base,exponent);
       System.out.println(power);

    }
}
