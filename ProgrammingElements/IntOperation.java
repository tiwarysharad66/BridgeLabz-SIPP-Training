package Day2;


        import java.util.Scanner;

        public class IntOperation {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter value of a: ");
                int a = scanner.nextInt();
                System.out.print("Enter value of b: ");
                int b = scanner.nextInt();
                System.out.print("Enter value of c: ");
                int c = scanner.nextInt();

                int result1 = a + b * c;
                int result2 = a * b + c;
                int result3 = c + a / b;
                int result4 = a % b + c;

                System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
            }
        }

