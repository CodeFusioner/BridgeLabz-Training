package regex;

/*
1️⃣1️⃣ Validate Credit Card Number

Visa: starts with 4, 16 digits
MasterCard: starts with 5, 16 digits
*/
public class ValidateCard {
    public static void main(String[] args) {
        String visa = "4123456789012345";
        String master = "5123456789012345";

        System.out.println(visa.matches("^4\\d{15}$"));
        System.out.println(master.matches("^5\\d{15}$"));
    }
}
