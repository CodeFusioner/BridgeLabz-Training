package regex;

/*
8️⃣ Replace Multiple Spaces with a Single Space

Input:
"This   is   an   example"

Output:
"This is an example"
*/
public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This   is   an   example";
        String result = input.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
