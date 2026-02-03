package streamApi;

import java.util.List;

public class SensorReadings {
    public static void main(String[] args) {

        List<Double> readings = List.of(22.5, 30.2, 18.9, 35.1);
        double threshold = 25.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                        System.out.println("High reading detected: " + r)
                );
    }
}
