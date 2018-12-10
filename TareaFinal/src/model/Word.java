
package model;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */



public class Word {

    public Word(int row, int column, int numberWord, String orientation, String lettler, String wordHelp) {
        this.row = row;
        this.column = column;
        this.numberWord = numberWord;
        this.orientation = orientation;
        this.lettler = lettler;
        this.wordHelp = wordHelp;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getNumberWord() {
        return numberWord;
    }

    public void setNumberWord(int numberWord) {
        this.numberWord = numberWord;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getLettler() {
        return lettler;
    }

    public void setLettler(String lettler) {
        this.lettler = lettler;
    }

    public String getWordHelp() {
        return wordHelp;
    }

    public void setWordHelp(String wordHelp) {
        this.wordHelp = wordHelp;
    }
 
    private int row;
    private int column;
    private int numberWord;
    private String orientation;
    private String lettler;
    private String wordHelp;
    

    public Word() {
    }

    
}
