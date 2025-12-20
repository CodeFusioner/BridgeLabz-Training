
import java.util.Scanner;

class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];

        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        for (int num : values) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println(num + " is positive even");
                else System.out.println(num + " is positive odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        int first = values[0];
        int last = values[values.length - 1];

        if (first == last) System.out.println("First and last are equal");
        else if (first > last) System.out.println("First is greater");
        else System.out.println("Last is greater");
    }
}
