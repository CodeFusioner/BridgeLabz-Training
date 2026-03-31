import java.util.Scanner;
public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get employee details
        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();
        // Check if employee qualifies for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("\nBonus Amount: " + bonus);
            System.out.println("Total Salary with Bonus: " + (salary + bonus));
        } else {
            System.out.println("\nNo bonus. Years of service must be more than 5.");
            System.out.println("Total Salary: " + salary);
        }
    }
}
