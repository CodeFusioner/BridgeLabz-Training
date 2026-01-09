import java.util.*;

class Flight {
    String flightNo;
    String source;
    String destination;
    int seats;

    public Flight(String no, String src, String dest, int seats) {
        this.flightNo = no;
        this.source = src;
        this.destination = dest;
        this.seats = seats;
    }
}
class Booking {

    String userName;
    Flight flight;

    public Booking(String userName, Flight flight) {
        this.userName = userName;
        this.flight = flight;
    }
}


class FlightService {

    private Flight[] flights;
    private List<Booking> bookings = new ArrayList<>();

    public FlightService() {
        flights = new Flight[] {
                new Flight("AI101", "Delhi", "Mumbai", 3),
                new Flight("IN202", "Delhi", "Pune", 2),
                new Flight("SJ303", "Mumbai", "Chennai", 4)
        };
    }
    public Flight searchFlight(String src, String dest) {
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                    f.destination.equalsIgnoreCase(dest)) {
                return f;
            }
        }
        return null;
    }
    public void bookFlight(String user, String src, String dest) {
        Flight f = searchFlight(src, dest);

        if (f == null || f.seats == 0) {
            System.out.println("No flight available.");
            return;
        }
        f.seats--;
        bookings.add(new Booking(user, f));
        System.out.println("Booking successful.");
    }
    public void viewBookings() {
        for (Booking b : bookings) {
            System.out.println(b.userName + " booked " + b.flight.flightNo +
                    " (" + b.flight.source + " → " + b.flight.destination + ")");
        }
    }
}

public class FlightApp {
    public static void main(String[] args) {
        FlightService service = new FlightService();

        service.bookFlight("Alice", "Delhi", "Mumbai");
        service.bookFlight("Bob", "Delhi", "Pune");
        service.bookFlight("Charlie", "Delhi", "Mumbai");

        System.out.println("\nAll Bookings:");
        service.viewBookings();
    }
}
