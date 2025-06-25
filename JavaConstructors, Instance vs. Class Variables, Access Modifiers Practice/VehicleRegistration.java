package constructors;

class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }
}
