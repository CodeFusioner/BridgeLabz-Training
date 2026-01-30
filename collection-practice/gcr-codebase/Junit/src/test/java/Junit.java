package Junit.src.test.java;
import static org.junit.jupiter.api.Assertions.*;

import Junit.src.main.java.Calculator;
import org.junit.jupiter.api.Test;

public class Junit {

    Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }
    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }
    @Test
    public void testMultiply() {
        int result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }
    @Test
    public void testDivide() {
        int result = calculator.divide(10, 5);
        assertEquals(2, result);
    }
}
