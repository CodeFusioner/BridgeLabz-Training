public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (isPalin(str)) {
                    if (max < str.length()) {
                        max = str.length();
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isPalin(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
