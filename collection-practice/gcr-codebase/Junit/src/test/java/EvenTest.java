package Junit.src.test.java;

/*
6️⃣ Parameterized Test – isEven
*/
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EvenTest {

    boolean isEven(int n) { return n % 2 == 0; }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testEven(int n) {
        assertTrue(isEven(n));
    }
}
