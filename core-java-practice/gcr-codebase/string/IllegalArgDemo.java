import java.util.Scanner;

public class IllegalArgDemo {

    static void genEx(String s) {
        s.substring(5, 2);
    }
    static void handleEx(String s) {
        try {
            s.substring(5, 2);   
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        genEx(s);      
        handleEx(s);   
    }
}
