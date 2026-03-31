package inheritance;

class Vehicle {
    int vehicleMaxSpeedVal;
    String vehicleFuelTypeVal;

    Vehicle(int speedVal, String fuelVal) {
        vehicleMaxSpeedVal = speedVal;
        vehicleFuelTypeVal = fuelVal;
    }

    void displayInfo() {
        System.out.println("Vehicle Info");
    }
}

class Car extends Vehicle {
    int carSeatCapacityVal;

    Car(int cSpeed, String cFuel, int seatCap) {
        super(cSpeed, cFuel);
        carSeatCapacityVal = seatCap;
    }

    @Override
    void displayInfo() {
        System.out.println("Car — Speed: " + vehicleMaxSpeedVal + ", Fuel: " + vehicleFuelTypeVal +
                ", Seats: " + carSeatCapacityVal);
    }
}

class Truck extends Vehicle {
    int truckLoadCapacityVal;

    Truck(int tSpeed, String tFuel, int loadCap) {
        super(tSpeed, tFuel);
        truckLoadCapacityVal = loadCap;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck — Speed: " + vehicleMaxSpeedVal + ", Fuel: " + vehicleFuelTypeVal +
                ", Load: " + truckLoadCapacityVal + "kg");
    }
}

class Motorcycle extends Vehicle {
    boolean motoHasABSVal;

    Motorcycle(int mSpeed, String mFuel, boolean hasABS) {
        super(mSpeed, mFuel);
        motoHasABSVal = hasABS;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle — Speed: " + vehicleMaxSpeedVal + ", Fuel: " + vehicleFuelTypeVal +
                ", ABS: " + motoHasABSVal);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicleArrayVal = new Vehicle[3];

        vehicleArrayVal[0] = new Car(180, "Petrol", 5);
        vehicleArrayVal[1] = new Truck(120, "Diesel", 5000);
        vehicleArrayVal[2] = new Motorcycle(160, "Petrol", true);

        for (Vehicle eachVehicleObj : vehicleArrayVal) {
            eachVehicleObj.displayInfo();   // Polymorphism in action
        }
    }
}

