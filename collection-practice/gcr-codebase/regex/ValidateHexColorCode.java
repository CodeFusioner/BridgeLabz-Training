package regex;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        /**
         A valid hex color:
         Starts with a #
         Followed by 6 hexadecimal characters (0-9, A-F, a-f).
         */
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        String regex = "^#[a-fA-F0-9]{6}";
        boolean match = Pattern.compile(regex).matcher(pattern).matches();

        if(match){
            System.out.println("Valid hex color");
        }else{
            System.out.println("Invalid hex color");
        }
        // kapilgupta1502@gmail.com
//        /*@yahoo*/@gla.ac.in
        String str = "^[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]{2,}";
    }
}
