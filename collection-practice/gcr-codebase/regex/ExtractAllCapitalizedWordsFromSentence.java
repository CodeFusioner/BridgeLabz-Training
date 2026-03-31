package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWordsFromSentence {
    public static void main(String[] args) {
        /**
         🔹 Example Text:
         "The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
         🔹 Expected Output:
          Eiffel, Tower, Paris, Statue, Liberty, New, York
         */

        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        String regex = "^[A-Z][a-zA-Z]+";

        String [] split = pattern.split(" ");
        List<String> ll = new ArrayList<>();

        for(String str : split){
            boolean match = Pattern.compile(regex).matcher(str).matches();
            if(match){
                ll.add(str);
            }
        }
        System.out.println(ll);

    }
}
