package filemanager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import main.TareaFinal;

public class WriterManagerbin {

    private ObjectOutputStream writer;

    public void open(String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }

    public void write() throws IOException {
   //     writer.writeObject(TareaFinal.listManager);
    }

    public void close() throws IOException {
        writer.close();
    }
}
