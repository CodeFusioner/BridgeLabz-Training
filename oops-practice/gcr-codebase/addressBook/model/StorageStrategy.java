package addressBook.model;

import java.util.List;

// UC18
public interface StorageStrategy{
    void save(List<ContactC> list)throws Exception;
}