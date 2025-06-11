package Day1;

import java.util.Scanner;

public class CalculateSimpleINterest {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int principal = s.nextInt();
        int rate = s.nextInt();
        int time = s.nextInt();
        int SimpleInterest = (principal*rate*time)/100;
        System.out.println(SimpleInterest);
    }
}
