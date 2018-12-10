package filemanager;

import user.UsersList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */

public class ReaderManagerbin {

    private ObjectInputStream reader;

    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    public UsersList read() throws IOException, ClassNotFoundException {
        return (UsersList) reader.readObject();
    }

    public void close() throws IOException {
        reader.close();
    }
}
