import java.util.Scanner;

class ZaraBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] pay = new double[10];
        double[] yrs = new double[10];
        double[] bonus = new double[10];
        double[] newPay = new double[10];

        double totalBonus = 0;
        double totalOldPay = 0;
        double totalNewPay = 0;

        for (int i = 0; i < 10; i++) {
            double sal = in.nextDouble();
            double exp = in.nextDouble();

            if (sal <= 0 || exp < 0) {
                i--;
                continue;
            }

            pay[i] = sal;
            yrs[i] = exp;
        }

        for (int i = 0; i < 10; i++) {
            if (yrs[i] > 5) {
                bonus[i] = pay[i] * 0.05;
            } else {
                bonus[i] = pay[i] * 0.02;
            }

            newPay[i] = pay[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldPay += pay[i];
            totalNewPay += newPay[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldPay);
        System.out.println("Total New Salary = " + totalNewPay);
    }
}
