/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;


import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author 
 */
public class UserValidator {

    public static Boolean toCheck(String User, String Password){
            try {
        File file;
        FileOutputStream fr=null;
        FileInputStream br= null;
        file = new File("userFile.ser");
        String datos[];
             String line;
             fr= new FileOutputStream(file);
             br= new FileInputStream(file);
             while ((line=br.readLine)!=null) {
                 datos = line.split("-");
                 if(User.equals(datos[0])&& Password.equals(datos[1])){
               return true;
                 }
        }

            fr.close(); 
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
         
        }
            return false;
    }
        public static Boolean toCheckUser(String User){
            try {
        File file;
        FileOutputStream fr=null;
        FileInputStream br= null;
        file = new File("userFile.txt");
        String datos[];
             String line;
             fr= new FileOutputStream(file);
             br= new FileInputStream(file);
             while ((line=br.readLine)!=null) {
                 datos = line.split("-");
                 if(User.equals(datos[0])){

               return true;
                 }
        }

            fr.close(); 
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
         
        }
            return false;
    }
}