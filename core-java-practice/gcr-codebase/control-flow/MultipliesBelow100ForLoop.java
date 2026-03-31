import java.util.Scanner;

public class MultipliesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");

        // Loop backward from 99 to 1
        for (int i = 99; i >= 1; i--) {
            if (i % number == 0) {  // Check if i is divisible by number
                System.out.print(i + " ");
            }
        }

    }
}