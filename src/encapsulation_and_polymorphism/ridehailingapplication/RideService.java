package encapsulation_and_polymorphism.ridehailingapplication;
/**
 * Class to process rides using different vehicle types.
 */
public class RideService {
    public static void calculateFareForRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Estimated Fare: ₹" + vehicle.calculateFare(distance));

        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            gpsVehicle.updateLocation("New Destination");
            System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
        }

        System.out.println("Ride Completed Successfully!\n");
    }
}
