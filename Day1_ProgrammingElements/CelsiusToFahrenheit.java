package Day1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Celsius = s.nextInt();
       int  Fahrenheit = (Celsius * 9/5) + 32;
       System.out.println(Fahrenheit);
    }
}
