public class CarRentalDetails {

    // Main method for testing
    public static void main(String[] args) {
        // Default rental
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental: " + defaultRental);

        // Parameterized rental
        CarRental paramRental = new CarRental("John Doe", "SUV", 5);
        System.out.println("Parameterized Rental: " + paramRental);

        // Copying the parameterized rental
        CarRental copiedRental = new CarRental(paramRental);
        System.out.println("Copied Rental: " + copiedRental);
    }
}


class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double COST_PER_DAY = 50.0; // Cost per day for car rental

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Car";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Method to calculate the total cost
    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Overriding toString() for better representation
    @Override
    public String toString() {
        return "CarRental{customerName='" + customerName + "', carModel='" + carModel + "', rentalDays=" + rentalDays +
                ", totalCost=" + calculateTotalCost() + "}";
    }
}
