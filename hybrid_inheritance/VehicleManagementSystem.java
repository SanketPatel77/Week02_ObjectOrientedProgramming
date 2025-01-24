package hybrid_inheritance;

// Define a superclass Vehicle with attributes like maxSpeed and model.
class Vehicle {
        // attributes
        private String model;
        private int maxSpeed;

        // constructor
        Vehicle(String model, int maxSpeed) {
                this.maxSpeed = maxSpeed;
                this.model = model;
        }

        // default constructor
        Vehicle() {
        };

        // display
        void display() {
                System.out.println("\nModel is : " + model + " and max speed is : " + maxSpeed);
        }
}

// Create an interface Refuelable with a method refuel().
interface Refuelable {
        public void refuel();
}

// Create an interface Chargable with a method charge().
interface Chargeable {
        public void charge();
}

// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should
// implement Refuelable, while ElectricVehicle include a charge() method.

class ElectricVehicle extends Vehicle implements Chargeable {

        // constructor
        ElectricVehicle(String model, int maxSpeed) {
                super(model, maxSpeed);
        }

        @Override
        public void charge() {
                System.out.println("Charging the vehicle");
        }

        @Override
        void display() {
                super.display();
        }

}

// similarly we create PetrolVehicle that implenets Refuelable interface
class PetrolVehicle extends Vehicle implements Refuelable {

        // constructor
        PetrolVehicle(String model, int maxSpeed) {
                super(model, maxSpeed);
        }

        @Override
        public void refuel() {
                System.out.println("refueling the vehicle");
        }

        @Override
        void display() {
                super.display();
        }
}

public class VehicleManagementSystem {
        public static void main(String[] args) {
            // create object
            PetrolVehicle petrolVehicle = new PetrolVehicle("xyz", 200);
            ElectricVehicle electricVehicle = new ElectricVehicle("Abc", 100);

            // call methods to display model name and max speed
            petrolVehicle.display();
            petrolVehicle.refuel();

            electricVehicle.display();
            electricVehicle.charge();
        }
}
