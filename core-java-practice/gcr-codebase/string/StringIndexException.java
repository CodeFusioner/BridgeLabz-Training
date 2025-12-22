
import java.util.Scanner;

public class StringIndexException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        int i = s.nextInt();
        try {
            genEx(t, i);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index " + i + " out of bounds");
        }
        handleEx(t, i);
    }
    public static void genEx(String t, int i) {
        char c = t.charAt(i);
    }
    public static void handleEx(String t, int i) {
        try {
            char c = t.charAt(i);
            System.out.println("Character at index " + i + ": " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index " + i);
        }
    }
}