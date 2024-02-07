package src.main.java.javarush;

public class Test {

    public static String text = "Стїґйф, Бм уствґї";
    public static int key = 2;
    public static Operation operation = Operation.ENCRYPT;

    public static void main(String[] args) {
       Cipher cipher = new Cipher();
       String textnew = "";
       if (operation == Operation.DECRYPT){
           textnew = cipher.getEncrypt(text, key);
           System.out.println(textnew);
       } else if (operation == Operation.ENCRYPT) {
           textnew = cipher.getDecrypt(text, key);
           System.out.println(textnew);
       } else if (operation == Operation.BRUTE_FORCE) {
           throw new UnsupportedOperationException("late");
       }

    }

}
