package arrays;

import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        if (limit <= 0) return;

        String[] res = new String[limit + 1];

        for (int i = 1; i <= limit; i++) {
            if (i % 15 == 0) res[i] = "FizzBuzz";
            else if (i % 3 == 0) res[i] = "Fizz";
            else if (i % 5 == 0) res[i] = "Buzz";
            else res[i] = String.valueOf(i);
        }

        for (int i = 1; i <= limit; i++) {
            System.out.println("Position " + i + " = " + res[i]);
        }
    }
}
