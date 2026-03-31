package Junit.src.test.java;

import Junit.src.main.java.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TempTest {
    @Test
    void testConversion() {
        assertEquals(32, new TemperatureConverter().cToF(0));
    }
}
