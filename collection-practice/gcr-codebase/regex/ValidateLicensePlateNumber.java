package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
//        Validate a License Plate Number
//        License plate format: Starts with two uppercase letters, followed by four digits.
//                Example: "AB1234" is valid, but "A12345" is invalid.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plate number: ");
        String str = sc.nextLine();

        String regex = "^[A-Z]{2}[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        boolean match = pattern.matcher(str).matches();
        if(match){
            System.out.println("Valid number plate");
        }else{
            System.out.println("Invalid number plate");
        }

    }
}
