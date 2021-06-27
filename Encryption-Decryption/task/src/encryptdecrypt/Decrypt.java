package encryptdecrypt;

public class Decrypt {
    static String allKeyDecrypt(String cyphertext, int key){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<cyphertext.length(); i++){
            char c = cyphertext.charAt(i);
            char newChar = (char) (c - key);
            sb.append(newChar);
        }
        return sb.toString();
    }
}
