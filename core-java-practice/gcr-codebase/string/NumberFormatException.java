
import java.util.Scanner;

public class NumberFormatException {
    static void genEx(String t) {
        Integer.parseInt(t);   
    }
    static void handleEx(String t) {
        try {
            Integer.parseInt(t);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        genEx(t);      
        handleEx(t);  
    }
}

