package encryptdecrypt;

import java.util.Scanner;

import static encryptdecrypt.Decrypt.*;
import static encryptdecrypt.Encrypt.*;

public class Start {
    static void start() {
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
                    allKeyEncrypt(input, key);
                    break;
                case DEC:
                    allKeyDecrypt(input, key);
                    break;
                default:
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("enter a valid operation");
        }

    }
}
