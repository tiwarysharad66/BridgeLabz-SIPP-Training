package Day2;

    import java.util.Scanner;

    public class TotalPurchase {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter unit price (INR): ");
            double unitPrice = input.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double total = unitPrice * quantity;

            System.out.println("The total purchase price is INR " + total + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        }
    }

