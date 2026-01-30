package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and https://example.org for more info.";

        String regex = "https?://\\S+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

