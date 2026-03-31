package string;

import java.util.Scanner;

public class ArrayException {
    static void genEx(String[] a) {
        System.out.println(a[a.length]);
    }
    static void handleEx(String[] a) {
        try {
            System.out.println(a[a.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        genEx(a);      
        handleEx(a);  
    }
}
