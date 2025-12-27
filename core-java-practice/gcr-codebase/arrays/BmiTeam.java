package arrays;

import java.util.Scanner;

class BmiTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        double[] wt = new double[count];
        double[] ht = new double[count];
        double[] bmi = new double[count];
        String[] status = new String[count];

        for (int i = 0; i < count; i++) {
            wt[i] = in.nextDouble();
            ht[i] = in.nextDouble();
        }

        for (int i = 0; i < count; i++) {
            bmi[i] = wt[i] / (ht[i] * ht[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Height: " + ht[i] +
                               " Weight: " + wt[i] +
                               " BMI: " + bmi[i] +
                               " Status: " + status[i]);
        }
    }
}

