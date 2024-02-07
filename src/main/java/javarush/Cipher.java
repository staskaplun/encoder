package src.main.java.javarush;

import java.util.ArrayList;

public class Cipher {

    private char getLetterShift(char letter, int shift){
        Alphabet alphabet = new Alphabet();
        ArrayList<Character> alphabetLis = alphabet.getAlphabetList();
        int index = alphabetLis.indexOf(letter);
        if (index == -1){
            return letter;
        }
        else {
            return alphabetLis.get(index + shift);
        }
    }

    public String getEncrypt(String text, int key){
        String textencrypt = "";
       char[] textarray = text.toCharArray();
       for (char letter: textarray){
           textencrypt = textencrypt + getLetterShift(letter, key);
       }
       return textencrypt;
    }

    public String getDecrypt(String text, int key){
        return getEncrypt(text, -key);
    }
}
