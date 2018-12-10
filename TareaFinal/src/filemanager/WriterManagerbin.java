package filemanager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import main.Main;
/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */

public class WriterManagerbin {

    private ObjectOutputStream writer;

    public void open(String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }

    public void write() throws IOException {
        writer.writeObject(Main.listManager);
    }

    public void close() throws IOException {
        writer.close();
    }
}
