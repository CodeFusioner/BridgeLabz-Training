import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent (positive integer): ");
        int exponent = sc.nextInt();

        if (exponent < 0) {
            System.out.println("Please enter a non-negative exponent.");
            return;
        }

        long result = 1;
        int counter = 0;

        while (counter < exponent) {
            result *= base;
            counter++;
        }

        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }
}
