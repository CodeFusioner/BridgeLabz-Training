package arrays;

import java.util.Scanner;

class BmiMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        double[][] personData = new double[count][3];
        String[] weightStatus = new String[count];

        for (int i = 0; i < count; i++) {
            double wt = in.nextDouble();
            double ht = in.nextDouble();

            if (wt <= 0 || ht <= 0) {
                i--;
                continue;
            }

            personData[i][0] = wt;
            personData[i][1] = ht;
        }

        for (int i = 0; i < count; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(
                "Height: " + personData[i][1] +
                " Weight: " + personData[i][0] +
                " BMI: " + personData[i][2] +
                " Status: " + weightStatus[i]
            );
        }
    }
}
