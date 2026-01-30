package Junit.src.test.java;

import Junit.src.main.java.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testInvalidUser() {
        assertThrows(IllegalArgumentException.class,
                () -> new UserRegistration().register("", "a@", "123"));
    }
}
