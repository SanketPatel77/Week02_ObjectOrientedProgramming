package encapsulation_and_polymorphism.ridehailingapplication;

/**
 * Interface for GPS functionality.
 */
public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
