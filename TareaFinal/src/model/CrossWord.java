/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */

public class CrossWord {
 /**
 *CrossWord metodo constructor que inicializa la clase
 * @param recibe las filas, columnas, y un vector de palabras
 * @return inicailiza 
 * 
 */

    public CrossWord(int rows, int columns, Word[] arrayWord) {
        this.rows = rows;
        this.columns = columns;
        this.arrayWord = arrayWord;
    }
 /**
 *getRows metodo que obtiene las columnas
 * @param no recibe parametros
 * @return las filas  
 * 
 */    

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Word[] getArrayWord() {
        return arrayWord;
    }

    public void setArrayWord(Word[] arrayWord) {
        this.arrayWord = arrayWord;
    }

    @Override
    public String toString() {
        return "CrossWord{" + "rows=" + rows + ", columns=" + columns + ", arrayWord=" + arrayWord + '}';
    }
    
    private int rows;
    private int columns;
    private Word[] arrayWord;
    
}
