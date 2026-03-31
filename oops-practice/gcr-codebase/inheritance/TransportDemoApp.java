package inheritance;

interface RefillableInterface {
    void refillFuelMethod();
}

class BaseTransport {
    int maxVelocityVal;
    String modelTitleVal;

    BaseTransport(int inputSpeedVal, String inputModelVal) {
        maxVelocityVal = inputSpeedVal;
        modelTitleVal = inputModelVal;
    }

    void showTransportInfo() {
        System.out.println("Model Name: " + modelTitleVal);
        System.out.println("Maximum Velocity: " + maxVelocityVal);
    }
}

class BatteryCar extends BaseTransport {
    int energyCapacityVal;

    BatteryCar(int speedVal, String modelVal, int capacityVal) {
        super(speedVal, modelVal);
        energyCapacityVal = capacityVal;
    }

    void plugChargeMethod() {
        System.out.println("Charging Battery Capacity: " + energyCapacityVal + " kWh");
    }
}

class FuelCar extends BaseTransport implements RefillableInterface {
    double tankVolumeVal;

    FuelCar(int speedVal, String modelVal, double tankVal) {
        super(speedVal, modelVal);
        tankVolumeVal = tankVal;
    }

    @Override
    public void refillFuelMethod() {
        System.out.println("Refilling Fuel Tank: " + tankVolumeVal + " liters");
    }
}

public class TransportDemoApp {
    public static void main(String[] args) {

        BatteryCar objBatteryCar = new BatteryCar(150, "EcoDrive-X", 75);
        FuelCar objFuelCar = new FuelCar(180, "RoadMaster-Z", 48.0);

        objBatteryCar.showTransportInfo();
        objBatteryCar.plugChargeMethod();

        System.out.println();

        objFuelCar.showTransportInfo();
        objFuelCar.refillFuelMethod();
    }
}
