import java.util.Scanner;

class DigitGrow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;

        while (num != 0) {
            if (idx == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[idx] = num % 10;
            num = num / 10;
            idx++;
        }

        int largest = 0;
        int second = 0;

        for (int i = 0; i < idx; i++) {
            int val = digits[i];
            if (val > largest) {
                second = largest;
                largest = val;
            } else if (val > second && val != largest) {
                second = val;
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + second);
    }
}

