package functionalInterface;

interface RentalVehicle {
    void rent();
    void returnVehicle();
}

class Car implements RentalVehicle {
    public void rent() {
        System.out.println("Car rented");
    }
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements RentalVehicle {
    public void rent() {
        System.out.println("Bike rented");
    }
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

class Bus implements RentalVehicle {
    public void rent() {
        System.out.println("Bus rented");
    }
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}

public class RentalVehicleSystem
{
    public static void main(String[] args) {

        RentalVehicle vehicle = new Bike();
        vehicle.rent();
        vehicle.returnVehicle();

    }
}
