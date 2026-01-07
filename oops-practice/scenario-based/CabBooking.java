import java.util.*;

class NoDriverAvailableException extends RuntimeException {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

interface FareCalculator {
    double calculateFare(double distance);
}

class NormalFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

class PeakFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15;
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Driver {
    int id;
    String name;
    boolean available;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
        this.available = true;
    }
}

class Ride {
    User user;
    Driver driver;
    double distance;
    double fare;
    String status;

    public Ride(User user, double distance) {
        this.user = user;
        this.distance = distance;
        this.status = "BOOKED";
    }
}

class RideService {
    List<Driver> drivers = new ArrayList<>();
    List<Ride> rides = new ArrayList<>();
    FareCalculator calculator;

    public RideService(FareCalculator calculator) {
        this.calculator = calculator;
    }

    public void addDriver(Driver d) {
        drivers.add(d);
    }

    public Ride bookRide(User user, double distance) {
        Ride ride = new Ride(user, distance);
        Driver driver = assignDriver();
        ride.driver = driver;
        ride.fare = calculator.calculateFare(distance);
        ride.status = "ASSIGNED";
        rides.add(ride);
        return ride;
    }

    private Driver assignDriver() {
        for (Driver d : drivers) {
            if (d.available) {
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No driver currently available");
    }

    public List<Ride> rideHistory() {
        return rides;
    }
}

public class CabBooking {
    public static void main(String[] args) {
        RideService service = new RideService(new PeakFareCalculator());
        service.addDriver(new Driver(1, "Arjun"));
        service.addDriver(new Driver(2, "Rahul"));

        User u = new User(1, "Kapil");
        Ride r = service.bookRide(u, 12.5);

        System.out.println("Driver: " + r.driver.name);
        System.out.println("Fare: " + r.fare);
        System.out.println("Status: " + r.status);
    }
}
