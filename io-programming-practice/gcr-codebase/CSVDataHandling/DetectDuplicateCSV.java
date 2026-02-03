package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) {
        String filePath = "students.csv";
        Set<String> seenIds = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String id = line.split(",")[0];

                if (!seenIds.add(id)) {
                    duplicates.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Duplicate Records:");
        duplicates.forEach(System.out::println);
    }
}
