package single_inheritance;

// Device (superclass)
class Device {
    // attributes
    private int deviceId;
    private String status;

    // constructor
    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // setters
    public void setDevideId(int deviceId) {
        this.deviceId = deviceId;
    }

    public void setDevideId(String status) {
        this.status = status;
    }

    // getters
    public int getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }
}

// Thermostat class (subclass)
class Thermostat extends Device {
    // attributes
    private int tempratureSetting;

    // constructor
    Thermostat(int deviceId, String status, int tempratureSetting) {
        super(deviceId, status);
        this.tempratureSetting = tempratureSetting;
    }

    // displayStatus() method to show each device's current setting
    public void displayStatus() {
        System.out.println("\nDevice Status");
        System.out.println("DeviceId :" + getDeviceId() + "\nDevice Status :" + getStatus() + "\nTemprature :"
                + tempratureSetting);
    }
}

public class SmartHomeDevices {

    public static void main(String[] args) {
        // create objec of Thermostat class
        Thermostat fan = new Thermostat(1001, "working", 25);

        Thermostat airConditioner = new Thermostat(1120, "Not working", 30);

        fan.displayStatus();
        airConditioner.displayStatus();
    }
}