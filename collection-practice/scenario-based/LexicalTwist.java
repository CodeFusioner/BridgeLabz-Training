import java.util.*;

public class LexicalTwist {

    public static boolean isValidWord(String s) {
        return !s.trim().contains(" ");
    }

    public static boolean isReverse(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString().equalsIgnoreCase(b);
    }

    public static boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (!isValidWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (!isValidWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        if (isReverse(first, second)) {
            StringBuilder sb = new StringBuilder(first);
            String rev = sb.reverse().toString().toLowerCase();
            rev = rev.replaceAll("[aeiou]", "@");
            System.out.println(rev);
        } else {
            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;
            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (isVowel(c)) vowels++;
                    else consonants++;
                }
            }

            LinkedHashSet<Character> set = new LinkedHashSet<>();

            if (vowels > consonants) {
                for (char c : combined.toCharArray()) {
                    if (isVowel(c)) set.add(c);
                    if (set.size() == 2) break;
                }
                for (char c : set) System.out.print(c);

            } else if (consonants > vowels) {
                for (char c : combined.toCharArray()) {
                    if (Character.isLetter(c) && !isVowel(c)) set.add(c);
                    if (set.size() == 2) break;
                }
                for (char c : set) System.out.print(c);

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
