package oops_pillars;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return vehicleId + " - Driver: " + driverName + " @ " + ratePerKm + "/km";
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location = "Standby";

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String location = "Standby";

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String location = "Standby";

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C01", "Ramesh", 15);
        Vehicle v2 = new Bike("B12", "Sohan", 8);
        Vehicle v3 = new Auto("A05", "Vikas", 12);

        System.out.println(v1.getVehicleDetails() + " | Fare: " + v1.calculateFare(10));
        System.out.println(v2.getVehicleDetails() + " | Fare: " + v2.calculateFare(10));
        System.out.println(v3.getVehicleDetails() + " | Fare: " + v3.calculateFare(10));
    }
}

