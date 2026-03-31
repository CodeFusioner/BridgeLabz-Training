package regex;

/*
1️⃣5️⃣ Validate Social Security Number (SSN)

Valid: 123-45-6789
Invalid: 123456789
*/
public class ValidateSSN {
    public static void main(String[] args) {
        String ssn = "123-45-6789";
        System.out.println(ssn.matches("^\\d{3}-\\d{2}-\\d{4}$"));
    }
}
