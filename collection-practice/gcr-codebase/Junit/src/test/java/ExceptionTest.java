package Junit.src.test.java;

/*
4️⃣ Test Exception Handling
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    int divide(int a, int b) { return a / b; }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> divide(5, 0));
    }
}
