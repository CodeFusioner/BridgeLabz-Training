import java.util.Scanner;

public class PowerForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent (positive integer): ");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.println("Please enter a non-negative exponent.");
            return;
        }

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + exponent + " = " + result);

        scanner.close();
    }
}
