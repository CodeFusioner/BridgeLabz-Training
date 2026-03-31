package Junit.src.test.java;

import org.junit.jupiter.api.Test;

import javax.swing.text.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    void testDate() {
        DateFormatter df = new DateFormatter();
        assertNotNull(df);
    }
}
