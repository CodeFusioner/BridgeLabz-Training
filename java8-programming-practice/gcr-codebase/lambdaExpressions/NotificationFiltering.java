package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + " : " + message;
    }
}


public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("EMERGENCY", "Heart rate critical"),
                new Alert("APPOINTMENT", "Doctor visit at 6 PM"),
                new Alert("MEDICINE", "Take blood pressure pill"),
                new Alert("EMERGENCY", "Oxygen level low")
        );
        alerts.stream().filter(t -> t.type.equals("EMERGENCY")).forEach(System.out::println);
    }
}
