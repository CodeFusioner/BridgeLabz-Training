public class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    CarRentalSystem() {
        customerName = "Customer";
        carModel = "Hatchback";
        rentalDays = 1;
    }

    CarRentalSystem(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        CarRentalSystem r1 = new CarRentalSystem();
        CarRentalSystem r2 = new CarRentalSystem("Divyansh", "SUV", 5);

        r1.display();
        r2.display();
    }
}
