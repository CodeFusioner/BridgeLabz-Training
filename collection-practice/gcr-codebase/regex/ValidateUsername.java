package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
//        A valid username:
//        Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
//        Must start with a letter
//        Must be between 5 to 15 characters long

        Scanner sc = new Scanner((System.in));
        String userName = sc.nextLine();

        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}";
        Pattern pattern1 = Pattern.compile(pattern);

        boolean match = pattern1.matcher(userName).matches();
        if(match){
            System.out.println("Valid user Name");
        }else {
            System.out.println("Invalid user name");
        }

    }
}
