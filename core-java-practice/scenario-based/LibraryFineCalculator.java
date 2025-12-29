import java.util.*;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter due date (in days):");
            int due = sc.nextInt();

            System.out.println("Enter return date (in days):");
            int returned = sc.nextInt();

            if (returned > due) {
                int fine = (returned - due) * 5;
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("No fine");
            }
        }
    }
}

