package addressBook.io;

import addressBook.model.ContactC;

import java.io.*;
import java.util.*;

public class FileStorage {

    // UC13 Write
    public static void writeToFile(List<ContactC> list,String file)throws Exception{
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        for(ContactC c:list){
            bw.write(c.toString());
            bw.newLine();
        }
        bw.close();
    }

    // UC13 Read
    public static List<String> readFile(String file)throws Exception{
        List<String> lines=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line;
        while((line=br.readLine())!=null){
            lines.add(line);
        }
        br.close();
        return lines;
    }
}