package arrays;

import java.util.Scanner;

class FactorsFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int size = 10;
        int[] factors = new int[size];
        int pos = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (pos == size) {
                    size *= 2;
                    int[] temp = new int[size];
                    for (int j = 0; j < pos; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[pos++] = i;
            }
        }

        for (int i = 0; i < pos; i++) System.out.print(factors[i] + " ");
    }
}

