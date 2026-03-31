public class HotelBookingSystem {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBookingSystem() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBookingSystem(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy constructor
    HotelBookingSystem(HotelBookingSystem h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        HotelBookingSystem b1 = new HotelBookingSystem();
        HotelBookingSystem b2 = new HotelBookingSystem("Divyansh", "Deluxe", 3);
        HotelBookingSystem b3 = new HotelBookingSystem(b2);

        b1.display();
        b2.display();
        b3.display();
    }
}
