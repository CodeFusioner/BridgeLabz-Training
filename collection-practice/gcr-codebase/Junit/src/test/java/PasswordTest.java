package Junit.src.test.java;

import Junit.src.main.java.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    @Test
    void testPassword() {
        assertTrue(new PasswordValidator().isValid("Abcd1234"));
    }
}
