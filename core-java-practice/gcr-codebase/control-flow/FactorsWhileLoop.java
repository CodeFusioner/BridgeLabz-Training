import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Factors of " + num + " are:");
        int ctr = 1;
        while (ctr <= num) {
            if (num % ctr == 0) {
                System.out.print(ctr + " ");
            }
            ctr++;
        }
    }
}
