package regex;

/*
1️⃣3️⃣ Extract Currency Values

Input:
"The price is $45.99, and the discount is 10.50."

Output:
$45.99
10.50
*/
import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        Matcher m = Pattern.compile("\\$?\\d+(\\.\\d{2})?").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
