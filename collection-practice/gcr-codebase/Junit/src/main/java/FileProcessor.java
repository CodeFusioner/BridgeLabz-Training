package Junit.src.main.java;

/*
8️⃣ File Handling
*/
import java.io.*;

public class FileProcessor {

    public void writeToFile(String file, String content) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content);
        }
    }

    public String readFromFile(String file) throws IOException {
        return new String(java.nio.file.Files.readAllBytes(java.nio.file.Path.of(file)));
    }
}
