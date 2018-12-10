/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
import user.User;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderManager {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public User read() throws IOException {
        User usuario = null;
        String line = reader.readLine();
        String[] data;

        
        if (line != null) {
            usuario = new User();
            data = line.split("-");
            usuario.setUsername(data[0]); 
            usuario.setPassword(data[1]); 
            
        }
        return usuario;
    }

    public void close() throws IOException {
        reader.close();
    }
}
