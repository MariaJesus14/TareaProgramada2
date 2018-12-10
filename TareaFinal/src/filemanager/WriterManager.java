/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import user.User;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class WriterManager {

    private BufferedWriter writer;

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName,true));
    }

    public void write(User user) throws IOException {
        writer.write(user.toFileString()+"\r\n" ); 
    }

    public void close() throws IOException {
        writer.close();
    }
}
