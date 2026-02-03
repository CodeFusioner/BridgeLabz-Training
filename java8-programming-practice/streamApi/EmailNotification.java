package streamApi;

import java.util.List;

public class EmailNotification {
    public static void main(String[] args) {
        List<String> emails = List.of(
                "a@example.com",
                "b@example.com",
                "c@example.com"
        );
        emails.forEach(email -> sendEmailNotification(email));
    }
    static void sendEmailNotification(String email) {
        System.out.println("Sending email to: " + email);
    }
}
