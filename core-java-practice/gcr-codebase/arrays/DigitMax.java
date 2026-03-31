package arrays;

import java.util.Scanner;

class DigitMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int pos = 0;

        while (num != 0 && pos < maxDigit) {
            digits[pos] = num % 10;
            num = num / 10;
            pos++;
        }

        int big = 0;
        int second = 0;

        for (int i = 0; i < pos; i++) {
            int val = digits[i];
            if (val > big) {
                second = big;
                big = val;
            } else if (val > second && val != big) {
                second = val;
            }
        }

        System.out.println("Largest digit = " + big);
        System.out.println("Second largest digit = " + second);
    }
}

