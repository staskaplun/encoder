package src.main.java.javarush;

import java.util.ArrayList;

public class Alphabet {

    private final char[] AlphabetEn = {'a','b','c','d','e','f','g','h','i','j'
            ,'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private final char[] AlphabetUk = {'а','б','в','г','ґ','д','е','є','ж','з','и'
            ,'і','ї','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ь','ю','я'};

    public ArrayList<Character> getAlphabetList(){
        ArrayList<Character> alphabetlist = new ArrayList<>();
        for (char leter: this.AlphabetEn){
           alphabetlist.add(leter);
        }
        for (char leter: this.AlphabetEn){
            alphabetlist.add(Character.toUpperCase(leter));
        }
        for (char leter: this.AlphabetUk){
            alphabetlist.add(leter);
        }
        for (char leter: this.AlphabetUk){
            alphabetlist.add(Character.toUpperCase(leter));
        }
        return alphabetlist;
    }
}
