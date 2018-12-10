/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class GestorEs {
   public static void mostrarMensaje (String mensaje){
       JOptionPane.showMessageDialog(null, mensaje);
   }
   
   public int pedirEntero (String mensaje){
       int entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
       return entero;
   }
   
   public String pedirString (String mensaje){
       String string = JOptionPane.showInputDialog(mensaje);
       return string;
   }
}
