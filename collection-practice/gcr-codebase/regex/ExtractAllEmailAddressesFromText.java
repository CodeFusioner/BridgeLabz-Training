package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExtractAllEmailAddressesFromText {
    public static void main(String[] args) {
        /**
         * 🔹 Example Text:
         * "Contact us at support@example.com and info@company.org"
         * 🔹 Expected Output:
         * support@example.com
         * info@company.org
         */

        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        List<String> ll = new ArrayList<>();

        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z.]+.[a-zA-Z]{2,}";

        String [] split = pattern.split(" ");
        for(String str : split){
            boolean match = Pattern.compile(regex).matcher(str).matches();
            if(match){
                ll.add(str);
            }
        }
        System.out.println(ll);
    }
}
