package com.scenariobased;
import java.util.Scanner;

public class MetroFareDeduction {
    public static double calculateFare(int distance) {
        return (distance <= 5) ? 15 : (distance <= 15) ? 25 : 40;
    }
    public static double deductBalance(double balance, double fare) {
        return balance - fare;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 200.0;
        while (true) {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter distance traveled (in km) or (-1) to exit: ");
            int distance = sc.nextInt();

            if (distance == -1) {
                System.out.println("Thank you");
                break;
            }
            double fare = calculateFare(distance);
            if (fare > balance) {
                System.out.println("Insufficient balance");
                break;
            }
            balance = deductBalance(balance, fare);
            System.out.println("Fare Deducted: " + fare);
        }
    }
}
