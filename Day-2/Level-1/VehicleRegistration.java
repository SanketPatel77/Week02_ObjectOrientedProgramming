public class VehicleRegistration {

    // Main Method for Testing
    public static void main(String[] args) {
        // Create vehicles
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle");

        // Display vehicle details before updating registration fee
        System.out.println("Before Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(200.00);

        // Display vehicle details after updating registration fee
        System.out.println("\nAfter Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}

class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static double registrationFee = 150.00; // Fixed registration fee for all vehicles

    // Default Constructor
    public Vehicle() {
        this.ownerName = "Unknown Owner";
        this.vehicleType = "Unknown Type";
    }

    // Parameterized Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class Method: Update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: $" + registrationFee);
        } else {
            System.out.println("Invalid fee. Registration fee must be positive.");
        }
    }


}
