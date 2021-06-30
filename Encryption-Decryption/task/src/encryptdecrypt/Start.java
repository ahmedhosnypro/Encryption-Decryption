package encryptdecrypt;

import java.util.Scanner;

class Encryptor {
    static String encrypt(String algorithm,String message, int key){
        Encrypt encryptor = null;
        switch(algorithm){
            case "shift":
                encryptor = new Shift(key, message);
                break;
            case "unicode":
                encryptor = new Unicode(key, message);
                break;
        }
        assert encryptor != null;
        return encryptor.encrypt();
    }
}

class Decrypts {
    static String decrypt(String algorithm,String ciphertext, int key){
        Decrypt decrypts = null;
        switch(algorithm){
            case "shift":
                decrypts = new DeShift(key, ciphertext);
                break;
            case "unicode":
                decrypts = new DeShiftUnicode(key, ciphertext);
                break;
        }
        assert decrypts != null;
        return decrypts.decrypt();
    }
}



public class Start {
    static String start(String algorithm, String opt, String keyS, String input) {
        String ret = "";
        try {
            Operation operation = Operation.valueOf(opt.toUpperCase());
            int key = 0;
            try {
                key = Integer.parseInt(keyS);
            } catch (IllegalArgumentException e) {
                ret = "enter a number";
            }
            switch (operation) {
                case ENC:
                    ret = Encryptor.encrypt(algorithm, input, key);
                    break;
                case DEC:
                    ret = Decrypts.decrypt(algorithm, input, key);
                    break;
                default:
                    break;
            }

        } catch (IllegalArgumentException e) {
            ret = "enter a valid operation";
        }

        return ret;
    }
    //standard input
    static String start() {
        String ret = "";
        Scanner scanner = new Scanner(System.in);

        String opt = scanner.nextLine().trim().toUpperCase();


        try {
            Operation operation = Operation.valueOf(opt);
            String input = scanner.nextLine().trim();
            String keyS = scanner.nextLine().trim();
            int key = 0;
            try {
                key = Integer.parseInt(keyS);
            } catch (IllegalArgumentException e) {
                System.out.println("enter a number");
            }
            switch (operation) {
                case ENC:
                    ret = Encryptor.encrypt("shift", input, key);
                    break;
                case DEC:
                    ret = Decrypts.decrypt("shift", input, key);
                    break;
                default:
                    break;
            }

        } catch (IllegalArgumentException e) {
            ret = "enter a valid operation";
        }
        return ret;
    }
}
