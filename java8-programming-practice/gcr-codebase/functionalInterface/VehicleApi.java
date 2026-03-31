package functionalInterface;

interface Vehicle {

    void displaySpeed();

    default void displayBattery() {
        // default: non-electric vehicles
        System.out.println("Battery info not available");
    }
}

class CarC implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 75%");
    }
}

public class VehicleApi {
    public static void main(String[] args) {
        Vehicle v1 = new CarC();
        Vehicle v2 = new ElectricCar();
        v1.displayBattery();
        v2.displayBattery();

    }
}
