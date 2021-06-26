package encryptdecrypt;

import java.util.HashMap;

import static encryptdecrypt.Start.*;

public class Main {
    public static void main(String[] args) {
        if (args.length >0 &&  args.length  %2 ==0){
            HashMap<String, String> arguments = new HashMap<>();
            for (int i = 0; i< args.length; i+=2){
                arguments.put(args[i], args[i+1]);
            }
            String opt = arguments.getOrDefault("-mode", "enc");
            String key = arguments.getOrDefault("-key", "0");
            String input = arguments.getOrDefault("-data", "").replaceAll("\"", "");
            start(opt, key, input);
        }
        else
            System.out.println("check input");

    }
}