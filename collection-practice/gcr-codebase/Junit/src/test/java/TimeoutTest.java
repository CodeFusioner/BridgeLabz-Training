package Junit.src.test.java;

/*
7️⃣ Performance Test using @Timeout
*/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TimeoutTest {

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        Thread.sleep(3000);
    }
}
