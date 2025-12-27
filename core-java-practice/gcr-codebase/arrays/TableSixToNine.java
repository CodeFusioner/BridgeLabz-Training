package arrays;

import java.util.Scanner;

class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] res = new int[4];

        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            res[idx++] = num * i;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + res[idx++]);
        }
    }
}

