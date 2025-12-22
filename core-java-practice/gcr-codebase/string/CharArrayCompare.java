import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        char[] a = getChars(t);
        char[] b = t.toCharArray();
        boolean r = comp(a, b);
        System.out.println("\nArrays match: " + r);
    }
    public static char[] getChars(String s) {
        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        return a;
    }
    public static boolean comp(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}