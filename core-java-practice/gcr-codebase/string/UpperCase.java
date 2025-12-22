import java.util.Scanner;

public class UpperCase {
    static String toUp(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                r += (char)(c - 32);
            else
                r += c;
        }
        return r;
    }
    static boolean cmp(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = toUp(s);
        String s2 = s.toUpperCase();
        System.out.println(cmp(s1, s2));
    }
}

