package arrays;

import java.util.Scanner;

class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] data = new double[10];
        double total = 0.0;
        int pos = 0;

        while (true) {
            double value = sc.nextDouble();
            if (value <= 0 || pos == 10) break;
            data[pos++] = value;
        }

        for (int i = 0; i < pos; i++) {
            System.out.println(data[i]);
            total += data[i];
        }

        System.out.println("Sum = " + total);
    }
}

