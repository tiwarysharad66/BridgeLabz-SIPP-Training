package Day1;

import java.util.Scanner;
public class PerimeterOfRectangle{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int width =s.nextInt();
        int perimeter  = 2*(length*width);
        System.out.println(perimeter);
    }

}
