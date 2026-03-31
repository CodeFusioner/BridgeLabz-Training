package Junit.src.test.java;

import Junit.src.main.java.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void testWithdraw() {
        BankAccount b = new BankAccount();
        b.deposit(100);
        assertThrows(IllegalArgumentException.class, () -> b.withdraw(200));
    }
}
