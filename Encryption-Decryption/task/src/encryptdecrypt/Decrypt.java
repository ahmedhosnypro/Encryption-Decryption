package encryptdecrypt;

public class Decrypt {
    static void allKeyDecrypt(String cyphertext, int key){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<cyphertext.length(); i++){
            char c = cyphertext.charAt(i);
            char newChar = (char) (c - key);
            sb.append(newChar);
        }
        System.out.println(sb);
    }
}
