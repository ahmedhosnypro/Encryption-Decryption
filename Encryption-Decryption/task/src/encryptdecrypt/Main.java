package encryptdecrypt;

import java.util.Scanner;

import static encryptdecrypt.Encrypt.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String keyS = scanner.nextLine().trim();
        int key = 0;
        try {
            key = Integer.parseInt(keyS);
        }catch (IllegalArgumentException e){
            System.out.println("enter a number");
        }
        if (key != 0){
            keyEncrypt(s, key);
        }else
            System.out.println("key shouldn't be zero");

    }
}