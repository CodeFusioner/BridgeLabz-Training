package functionalInterface;


interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        if (password == null) return false;

        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String password = "Secure123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
