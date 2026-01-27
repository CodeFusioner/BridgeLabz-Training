package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.text"))){
            String line = br.readLine();
            System.out.println(line);
        }catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
