package src.main.java.javarush;

import java.util.ArrayList;

public class Alphabet {
    private final char[] AlphabetEn = {'a','b','c','d','e','f','g','h','i','j'
            ,'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private final char[] AlphabetUk = {'а','б','в','г','ґ','д','е','є','ж','з','и'
            ,'і','ї','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ь','ю','я'};

    public char[] getAlphabetEn() {
        return this.AlphabetEn;
    }

    public char[] getAlphabetUk() {
        return this.AlphabetUk;
    }

    public Alphabet(){
    }

    public char getLetterShift(char letter,int shift){
        ArrayList<Character> alphabetLis = getAlphabetList();
        int index = getAlphabetList().indexOf(letter);
        if (index == -1){
           return letter;
        }
        else {
            return alphabetLis.get(index + shift);
        }
    }

    private ArrayList<Character> getAlphabetList(){
        ArrayList<Character> alphabetlist = new ArrayList<>();

        for (char leter: this.AlphabetEn){
           alphabetlist.add(leter);
        }

        return alphabetlist;
    }
}
