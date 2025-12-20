import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int idx = 0;

        while (num != 0) {
            digits[idx++] = num % 10;
            num = num / 10;
        }

        int[] rev = new int[count];
        int pos = 0;

        for (int i = count - 1; i >= 0; i--) {
            rev[pos++] = digits[i];
        }

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
        }
    }
}

