
import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) result.append(c);
        }

        System.out.println("Modified string: " + result);
    }
}
