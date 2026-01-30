package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExtractDatesInFormat {
    public static void main(String[] args) {
        /**
         * 🔹 Example Text:
         * "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
         * 🔹 Expected Output:
         * 12/05/2023, 15/08/2024, 29/02/2020
         */

        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        String regex = "^[0-9]{2}/[0-9]{2}/[0-9]{4}";
        String [] split = pattern.split("[, \\s]+");

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
