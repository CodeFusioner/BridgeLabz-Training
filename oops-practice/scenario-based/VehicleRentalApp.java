import java.util.ArrayList;
import java.util.List;

interface IRentable {
    double calculateRent(int days);
}

abstract class Vehicles implements IRentable {

    protected int vehicleId;
    protected String brand;
    protected double pricePerDay;
    protected boolean available = true;

    public Vehicles(int id, String brand, double pricePerDay) {
        this.vehicleId = id;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }

    public int getVehicleId() { return vehicleId; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public abstract void displayInfo();
}

class Bike extends Vehicles {

    public Bike(int id, String brand, double price) {
        super(id, brand, price);
    }

    public double calculateRent(int days) {
        return days * pricePerDay;
    }

    public void displayInfo() {
        System.out.println("Bike → " + brand + " | ₹" + pricePerDay + "/day");
    }
}

class Car extends Vehicles {

    public Car(int id, String brand, double price) {
        super(id, brand, price);
    }

    public double calculateRent(int days) {
        return days * pricePerDay * 1.2;
    }

    public void displayInfo() {
        System.out.println("Car → " + brand + " | ₹" + pricePerDay + "/day");
    }
}

class Truck extends Vehicles {

    public Truck(int id, String brand, double price) {
        super(id, brand, price);
    }

    public double calculateRent(int days) {
        return days * pricePerDay * 1.5;
    }

    public void displayInfo() {
        System.out.println("Truck → " + brand + " | ₹" + pricePerDay + "/day");
    }
}

class Customer {
    private int customerId;
    private String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public String getName() { return name; }
}

class RentalService {
    List<Vehicles> vehicles = new ArrayList<>();

    public void addVehicle(Vehicles v){
        vehicles.add(v);
    }
    public void viewVehicles(){
        for(Vehicles v : vehicles){
            v.displayInfo();
        }
    }
    public void changeAvailability(int vehicleId, boolean status){
        for(Vehicles v : vehicles){
            if(v.getVehicleId() == vehicleId){
                v.setAvailable(status);
                return;
            }
        }
    }
    public void deleteVehicle(int vehicleId){
        vehicles.removeIf(v -> v.getVehicleId() == vehicleId);
    }
    public Vehicles getVehicleById(int vehicle){
        for(Vehicles v : vehicles){
            if(v.getVehicleId() == vehicle){
                return v;
            }
        }
        return null;
    }
}
public class VehicleRentalApp{
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        Vehicles bike1 = new Bike(1, "Yamaha", 500);
        Vehicles car1 = new Car(2, "ferrari", 1500);
        Vehicles truck1 = new Truck(3, "Volvo", 2500);

        rentalService.addVehicle(bike1);
        rentalService.addVehicle(car1);
        rentalService.addVehicle(truck1);

        rentalService.viewVehicles();
        Vehicles v = rentalService.getVehicleById(2);
        if(v != null){
            System.out.println("Rent for 5 days: " + v.calculateRent(5));
        }
    }
}
