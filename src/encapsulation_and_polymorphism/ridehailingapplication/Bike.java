package encapsulation_and_polymorphism.ridehailingapplication;

/**
 * Class representing a Bike with GPS functionality.
 */
public class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing the abstract method for fare calculation
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implementing GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation == null ? "Location not set" : currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
