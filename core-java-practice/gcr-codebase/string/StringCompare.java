import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        boolean r1 = comp(a, b);
        boolean r2 = a.equals(b);
        System.out.println("Custom method (charAt) result: " + r1);
        System.out.println("Built-in equals() result: " + r2);
        System.out.println("Results match: " + (r1 == r2));
    }
    public static boolean comp(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}