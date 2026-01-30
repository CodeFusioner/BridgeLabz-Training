package Junit.src.test.java;

import Junit.src.main.java.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils su = new StringUtils();

    @Test void testReverse() {
        assertEquals("avaJ", su.reverse("Java"));
    }

    @Test void testPalindrome() {
        assertTrue(su.isPalindrome("madam"));
    }

    @Test void testUpperCase() {
        assertEquals("HELLO", su.toUpperCase("hello"));
    }
}
