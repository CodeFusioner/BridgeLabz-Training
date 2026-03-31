package arrays;

import java.util.Scanner;

class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int pos = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                flat[pos++] = matrix[i][j];
            }
        }

        for (int val : flat) System.out.print(val + " ");
    }
}

