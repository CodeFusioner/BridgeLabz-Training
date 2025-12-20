import java.util.Scanner;

class OddEvenSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        if (limit <= 0) {
            System.out.println("Invalid number");
            return;
        }

        int[] even = new int[limit / 2 + 1];
        int[] odd = new int[limit / 2 + 1];
        int evenPos = 0, oddPos = 0;

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) even[evenPos++] = i;
            else odd[oddPos++] = i;
        }

        for (int i = 0; i < oddPos; i++) System.out.print(odd[i] + " ");
        System.out.println();
        for (int i = 0; i < evenPos; i++) System.out.print(even[i] + " ");
    }
}

