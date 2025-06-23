
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);

        if (result < 0) System.out.println(s1 + " comes before " + s2);
        else if (result > 0) System.out.println(s2 + " comes before " + s1);
        else System.out.println("Both strings are equal.");
    }
}
