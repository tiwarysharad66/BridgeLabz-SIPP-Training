package constructors;

public class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;

    // Parameterized constructor
    CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Default constructor
    CarRentalSystem() {
        this("Sharad Kumar", "Creta", 10); // Constructor chaining
    }

    // Method to calculate total cost
    int totalCost() {
        return rentalDays * 1000; // Assuming ₹1000 per day
    }

    // Method to display rental details
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + totalCost());
    }

    // Main method
    public static void main(String[] args) {
        CarRentalSystem s1 = new CarRentalSystem(); // using default constructor
        s1.display();

        System.out.println("\n---\n");

        CarRentalSystem s2 = new CarRentalSystem("Aman Singh", "Swift", 5); // using parameterized constructor
        s2.display();
    }
}
