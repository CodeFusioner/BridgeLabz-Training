import java.util.*;

public class MovieBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int customer = 1; customer <= 3; customer++) {
            System.out.println("Enter movie type (action/comedy/drama):");
            String movieType = sc.next();

            System.out.println("Enter seat type (gold/silver):");
            String seatType = sc.next();

            System.out.println("Do you want snacks? (yes/no):");
            String snacks = sc.next();

            int price = 0;

            switch (movieType.toLowerCase()) {
                case "action":
                    price = 200;
                    break;
                case "comedy":
                    price = 180;
                    break;
                case "drama":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            if (seatType.equalsIgnoreCase("gold")) price += 100;
            else if (seatType.equalsIgnoreCase("silver")) price += 50;

            if (snacks.equalsIgnoreCase("yes")) price += 80;

            System.out.println("Total price: ₹" + price);
            System.out.println("----------------------");
        }
        sc.close();
    }
}
