package Day1;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int radius = s.nextInt();
        int area = (int)(Math.PI)*((radius*radius));
        System.out.println(area);
    }
}
