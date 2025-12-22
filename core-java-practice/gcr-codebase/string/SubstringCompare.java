
import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        int a = s.nextInt();
        int b = s.nextInt();
        String c = getSub(t, a, b);
        String d = t.substring(a, b);
        boolean r = comp(c, d);
        System.out.println("Custom substring: " + c);
        System.out.println("Built-in substring: " + d);
        System.out.println("Substrings match: " + r);
    }
    public static String getSub(String s, int a, int b) {
        String r = "";
        for (int i = a; i < b; i++) {
            r += s.charAt(i);
        }
        return r;
    }
    public static boolean comp(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }    
}