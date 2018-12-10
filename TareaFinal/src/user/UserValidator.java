/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Hansy Gonzalez
 */
public class UserValidator {

    public static Boolean toCheck(String User, String Password){
            try {
        File archivo;
        FileReader fr=null;
        BufferedReader br= null;
        archivo = new File("userFile.txt");
        String datos[];
             String linea;
             fr= new FileReader(archivo);
             br= new BufferedReader(fr);
             while ((linea=br.readLine())!=null) {
                 datos = linea.split("-");
                 if(User.equals(datos[0])&& Password.equals(datos[1])){

               return true;
                 }
        }

            fr.close(); //importante cerrar el archivo
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
         
        }
            return false;
    }
        public static Boolean toCheckUser(String User){
            try {
        File archivo;
        FileReader fr=null;
        BufferedReader br= null;
        archivo = new File("userFile.txt");
        String datos[];
             String linea;
             fr= new FileReader(archivo);
             br= new BufferedReader(fr);
             while ((linea=br.readLine())!=null) {
                 datos = linea.split("-");
                 if(User.equals(datos[0])){

               return true;
                 }
        }

            fr.close(); //importante cerrar el archivo
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
         
        }
            return false;
    }
}