import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your lucky number: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Try again.");
                sc.next();
                continue;
            }
            int num = sc.nextInt();
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Congratulations! You win a gift!");
            } else {
                System.out.println("Better luck next time!");
            }
            System.out.print("Next visitor? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) break;
        }
    }
}

