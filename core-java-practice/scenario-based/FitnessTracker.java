import java.util.*;

public class FitnessTracker {
    public static void main(String[] args) {
        int[] pushups = {20, 25, 0, 30, 35, 0, 40};
        int total = 0;
        int days = 0;

        for (int p : pushups) {
            if (p == 0) continue;
            total += p;
            days++;
        }

        double average = (days > 0) ? (double) total / days : 0;
        System.out.println("Total Push-ups: " + total);
        System.out.println("Average (worked days only): " + average);
    }
}
