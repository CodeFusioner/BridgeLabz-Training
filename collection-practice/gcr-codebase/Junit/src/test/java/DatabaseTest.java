package Junit.src.test.java;

import Junit.src.main.java.DatabaseConnection;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void teardown() {
        db.disconnect();
    }

    @Test
    void testConnection() {
        assertTrue(db.connected);
    }
}
