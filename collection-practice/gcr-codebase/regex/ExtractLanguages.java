package regex;

/*
1️⃣2️⃣ Extract Programming Language Names

Input:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."

Output:
Java
Python
JavaScript
Go
*/
import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
