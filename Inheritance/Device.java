// Superclass: Device
class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Reuse base method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Test Class
public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH123", "ON", 22.5);
        t1.displayStatus();
    }
}
