package streamApi;

import java.util.List;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = List.of("Divyansh", "Amit", "Neha");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
