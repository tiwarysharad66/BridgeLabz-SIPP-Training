package Day2;


    import java.util.Scanner;

    public class BasicCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();

            double sum = number1 + number2;
            double diff = number1 - number2;
            double prod = number1 * number2;
            double div = number1 / number2;

            System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                    + number1 + " and " + number2 + " is " + sum + ", " + diff + ", " + prod + ", and " + div);
        }
    }

