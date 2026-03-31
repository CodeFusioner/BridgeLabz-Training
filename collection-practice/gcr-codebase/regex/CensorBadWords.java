package regex;

/*
9️⃣ Censor Bad Words in a Sentence

Bad words: damn, stupid

Input:
"This is a damn bad example with some stupid words."

Output:
"This is a **** bad example with some **** words."
*/
public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String regex = "\\b(damn|stupid)\\b";
        System.out.println(input.replaceAll(regex, "****"));
    }
}
