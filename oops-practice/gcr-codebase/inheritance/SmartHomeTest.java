package inheritance;

class Device {
    String deviceIdVar;
    String deviceStatusVar;

    Device(String idVal, String statusVal) {
        deviceIdVar = idVal;
        deviceStatusVar = statusVal;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceIdVar);
        System.out.println("Status: " + deviceStatusVar);
    }
}

class Thermostat extends Device {
    double thermostatTempSettingVar;

    Thermostat(String idVal, String statusVal, double tempSettingVal) {
        super(idVal, statusVal);
        thermostatTempSettingVar = tempSettingVal;
    }

    @Override
    void displayStatus() {
        System.out.println("Device ID: " + deviceIdVar);
        System.out.println("Status: " + deviceStatusVar);
        System.out.println("Temperature Setting: " + thermostatTempSettingVar + "°C");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat objThermostat = new Thermostat("TH-101", "ON", 24.5);

        objThermostat.displayStatus();
    }
}
