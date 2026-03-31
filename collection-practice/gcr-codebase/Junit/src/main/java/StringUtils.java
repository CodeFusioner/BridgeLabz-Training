package Junit.src.main.java;

/*
2️⃣ String Utility Methods
reverse, isPalindrome, toUpperCase
*/
public class StringUtils {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public String toUpperCase(String s) {
        return s.toUpperCase();
    }
}
