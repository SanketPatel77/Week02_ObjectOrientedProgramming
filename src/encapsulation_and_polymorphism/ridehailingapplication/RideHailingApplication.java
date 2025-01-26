package encapsulation_and_polymorphism.ridehailingapplication;

/**
 * Main class to test the Ride Hailing Application.
 */
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating different vehicles
        Vehicle car = new Car("CAR123", "Amit Singh", 15.0);
        Vehicle bike = new Bike("BIKE456", "Rahul Sharma", 8.0);
        Vehicle auto = new Auto("AUTO789", "Suresh Yadav", 10.0);

        // Processing rides dynamically using polymorphism
        RideService.calculateFareForRide(car, 10);  // 10 km ride
        RideService.calculateFareForRide(bike, 5);  // 5 km ride
        RideService.calculateFareForRide(auto, 7);  // 7 km ride
    }
}
