package arrays;

import java.util.Scanner;

class DigitFreq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int temp = num;
        int len = 0;

        while (temp != 0) {
            len++;
            temp = temp / 10;
        }

        int[] digits = new int[len];
        int idx = 0;

        while (num != 0) {
            digits[idx++] = num % 10;
            num = num / 10;
        }

        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " = " + freq[i]);
            }
        }
    }
}
