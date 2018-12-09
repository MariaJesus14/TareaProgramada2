/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import View.Game;
import filemanager.ReaderFiletxt;
import java.io.IOException;
import model.CrossWord;
import model.Word;

/**
 *
 * @author Roibin
 */
public class LogicGame {
    Word word = new Word();
    int coutChar = 0;
    ReaderFiletxt reader = new ReaderFiletxt();
    Game game;

    public void LGame(int level) throws IOException {
        if (level == 1) {
            CrossWord cross = reader.readFileEasy("files/level1/1.txt", 6);
            String[][] matrixGame = makeMatrix(cross);
            game = new Game(matrixGame);
            game.setVisible(true);
        } else {
            if (level == 2) {
//                reader.readFile("C:\\Prueba\\facil\\1.txt", 8);
            } else {
                if (level == 3) {
//                    reader.readFile("C:\\Prueba\\facil\\1.txt", 10);
                } else {
//                    reader.readFile("C:\\Prueba\\facil\\1.txt", 12);
                }
            }
        }
    }
    
    public static int revisar (String [][] matrixGame, String [][] matrixPlayer,Word[] wordList, int arrayIndex, int wordCount, int correctLetter,int row, int column){
        if(wordList[arrayIndex].getOrientation().equals("H")){
            if(matrixGame[ row ][ column].equals(matrixPlayer[ row ][ column ])){
                if(column == wordList[arrayIndex].getLettler().length()-1){
                    if(wordCount == wordList.length-1){
                        return wordCount;
                    }
                        wordCount +=1;
                        return revisar(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
                }else{
                    correctLetter +=1;
                    return revisar(matrixGame, matrixPlayer, wordList, arrayIndex, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn()+1);
                }
            }else{
                return revisar(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
            }
        }else{
            if(matrixGame[ row ][ column].equals(matrixPlayer[ row ][ column ])){
                if( row == wordList[arrayIndex].getLettler().length()-1){
                    if(wordCount == wordList.length-1){
                        return wordCount;
                    }
                    wordCount +=1;
                    return revisar(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
                }else{
                    correctLetter +=1;
                    return revisar(matrixGame, matrixPlayer, wordList, arrayIndex, wordCount, correctLetter,wordList[arrayIndex].getRow()+1,wordList[arrayIndex].getColumn());
                }
            }else{
                return revisar(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
            }
        }
        
    }

    public String[][] makeMatrix(CrossWord cross) {
        String[][] matrixGame = new String[cross.getRows()][cross.getColumns()];
        for (int i = 0; i < cross.getArrayWord().length; i++) {
            char[] arrayLetter = getArray(cross.getArrayWord()[i].getLettler());
            int row = cross.getArrayWord()[i].getRow();
            int column = cross.getArrayWord()[i].getColumn();

            if (cross.getArrayWord()[i].getOrientation().equals("H")) {
                for (int count = 0; column < arrayLetter.length; column++, count++) {
                    matrixGame[cross.getArrayWord()[i].getRow()][column] = arrayLetter[count] + "";

                }
            } else {
                for (int count = 0 ; count < arrayLetter.length; row++, count++) {
                    matrixGame[row][cross.getArrayWord()[i].getColumn()] = arrayLetter[count] + "";

                }
            }

        }
        return matrixGame;

    }

    public char[] getArray(String word) {
        char[] array = word.toCharArray();
        return array;
    }

}
