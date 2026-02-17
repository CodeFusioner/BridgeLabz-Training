package addressBook.io;

import java.io.FileWriter;
import java.util.List;

import addressBook.model.ContactC;
import com.opencsv.CSVWriter;
public class CSVStorage {

    // UC14
    public static void writeCSV(List<ContactC> list, String file)throws Exception{
        CSVWriter writer=new CSVWriter(new FileWriter(file));

        for(ContactC c:list){
            String[] data={
                    c.getFirstName(),
                    c.getLastName(),
                    c.getCity(),
                    c.getState()
            };
            writer.writeNext(data);
        }
        writer.close();
    }
}