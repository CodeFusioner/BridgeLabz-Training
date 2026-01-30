package Junit.src.test.java;
import Junit.src.main.java.FileProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class FileProcessorTest {

    FileProcessor fp = new FileProcessor();

    @Test
    void testFileIO() throws IOException {
        fp.writeToFile("test.txt", "Hello");
        assertEquals("Hello", fp.readFromFile("test.txt"));
    }
}
