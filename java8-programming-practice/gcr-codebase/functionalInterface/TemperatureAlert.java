package functionalInterface;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        Predicate<Double> highTempAlert =
                temp -> temp > 38.0;

        double temperature = 39.5;

        if (highTempAlert.test(temperature)) {
            System.out.println("⚠️ High temperature alert!");
        }
    }
}
