package Junit.src.main.java;

public class UserRegistration {
    public void register(String u, String e, String p) {
        if (u.isEmpty() || !e.contains("@") || p.length() < 6)
            throw new IllegalArgumentException();
    }
}
