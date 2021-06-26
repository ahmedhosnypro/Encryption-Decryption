package encryptdecrypt;

import java.util.Scanner;

public class Encrypt {
    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    static void encrypt(){
        String s = "we found a treasure!";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char newChar = c;
            if (c>=65 && c <=90){
                int n = 90 - c;
                if (n<13){
                    newChar =(char) (90 + n);
                }
                else newChar = (char) (65 - (25-n));
            }
            else if (c>=97 && c<=122){
                int n = 122 - c;
                if (n<13){
                    newChar =(char) (97 + n);
                }
                else newChar = (char) (122 - (25-n));
            }
            sb.append(newChar);
        }
        System.out.println(sb);
    }
}

