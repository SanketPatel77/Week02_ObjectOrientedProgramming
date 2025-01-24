// Vehicle class (superclass)
class Vehicle {
    // attribute of vehicle
    private int maxSpeed;
    private String fuelType;

    // constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display information of vehicle
    public void displayInfo() {
        System.out.println("Maximum speed :" + maxSpeed + ", fuelType :" + fuelType);
    }

}

// Car class (subclass extends Vehicle)
class Car extends Vehicle {
    // attribute
    private int seatCapacity;

    // constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Method to display information
    @Override
    public void displayInfo() {
        System.out.println("\nCar Information :");
        super.displayInfo(); // display common information
        System.out.println("Seat Capacity :" + seatCapacity);
    }
}

// Truck class (subclass extends Vehicle)
class Truck extends Vehicle {
    // attribute
    private int loadCapacity;

    // constructor
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Method to display information
    @Override
    public void displayInfo() {
        System.out.println("\nTruck Information :");
        super.displayInfo(); // display common information
        System.out.println("Load Capacity :" + loadCapacity + " ton");
    }
}

// Motorcycle class (subclass extends Vehicle)
class Motorcycle extends Vehicle {
    // attribute
    private int mileage;

    // constructor
    Motorcycle(int maxSpeed, String fuelType, int mileage) {
        super(maxSpeed, fuelType);
        this.mileage = mileage;
    }

    // Method to display information
    @Override
    public void displayInfo() {
        System.out.println("\nMotorcycle Information :");
        super.displayInfo(); // display common information
        System.out.println("Mileage :" + mileage + " kmpl");
    }
}

// class with main method
public class VehicleTransportSystem {
    public static void main(String[] args) {
        // create objects of subclass
        Vehicle car = new Car(220, "Diesel", 5);
        Vehicle truck = new Truck(150, "Diesel", 500);
        Vehicle motorcycle = new Motorcycle(120, "Petrol", 50);

        // create array of Vehicle type to store objects of different vehicle
        Vehicle[] array = new Vehicle[3];
        array[0] = car;
        array[1] = truck;
        array[2] = motorcycle;

        for (Vehicle vehicle : array) {
            vehicle.displayInfo();
        }
    }
}