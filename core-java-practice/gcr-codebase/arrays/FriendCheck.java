package arrays;

import java.util.Scanner;

class FriendCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = in.nextInt();
            height[i] = in.nextDouble();
        }

        int youngIdx = 0;
        int tallIdx = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngIdx]) {
                youngIdx = i;
            }
            if (height[i] > height[tallIdx]) {
                tallIdx = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngIdx]);
        System.out.println("Tallest friend: " + names[tallIdx]);
    }
}
