package Day1;

import java.util.Scanner;

public class ConversionKilometersToMiles {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        double kilometers = s.nextDouble();
        double Miles = (kilometers*0.621371);
        System.out.println(Miles);
    }
}
