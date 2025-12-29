import java.util.Scanner;

public class BusRouteDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int distancePerStop = 3;
        String choice = "no";

        while (!choice.equalsIgnoreCase("yes")) {
            totalDistance += distancePerStop;
            System.out.println("Bus reached next stop. Total distance: " + totalDistance + " km");
            System.out.print("Do you want to get off? (yes/no): ");
            choice = sc.nextLine();
        }

        System.out.println("You got off the bus. Final distance travelled: " + totalDistance + " km");
    }
}
