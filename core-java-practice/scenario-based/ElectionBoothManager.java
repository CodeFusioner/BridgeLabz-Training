import java.util.Scanner;

public class ElectionBoothManager {
    public static boolean isEligible(int age) {
        return age >= 18;
    }
    public static int[] recordVote(int vote, int[] votes) {

        switch (vote) {
            case 1:
                votes[0]++;
                break;
            case 2:
                votes[1]++;
                break;
            case 3:
                votes[2]++;
                break;
            default:
                System.out.println("Invalid vote choice.");
        }
        return votes;
    }
    public static void displayResults(int[] votes) {
        System.out.println("\nElection Results");
        System.out.println("Candidate 1 Votes: " + votes[0]);
        System.out.println("Candidate 2 Votes: " + votes[1]);
        System.out.println("Candidate 3 Votes: " + votes[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[3];
        while (true) {
            System.out.print("\nEnter age (or -1 to exit): ");
            int age = sc.nextInt();
            if (age == -1) {
                System.out.println("Voting ended.");
                break;
            }
            if (!isEligible(age)) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.println("Cast your vote:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            int vote = sc.nextInt();
            votes = recordVote(vote, votes);
        }
        displayResults(votes);

    }
}
