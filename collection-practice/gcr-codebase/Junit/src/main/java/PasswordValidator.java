package Junit.src.main.java;

public class PasswordValidator {
    public boolean isValid(String p) {
        return p.matches("(?=.*[A-Z])(?=.*\\d).{8,}");
    }
}
