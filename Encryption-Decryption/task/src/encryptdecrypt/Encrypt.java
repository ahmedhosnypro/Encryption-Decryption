package encryptdecrypt;

import java.util.Scanner;

public class Encrypt {
    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    static void simpleEncrypt(){
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

    static void keyEncrypt(String s ,int key){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char newChar = c;
            if (c>=65 && c <=90){
                if (c + key < 90){
                    newChar = (char) (c + key);
                }else{
                    key -= (90 - c);
                    newChar = (char) (64 + key);
                }
            }
            else if (c>=97 && c<=122){
                if (c + key < 122){
                    newChar = (char) (c + key);
                }else{
                    int  tmpKey = key - (122 - c);
                    newChar = (char) (96 + tmpKey);
                }
            }
            sb.append(newChar);
        }
        System.out.println(sb);
    }

}

