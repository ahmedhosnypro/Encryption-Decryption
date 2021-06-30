package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import static encryptdecrypt.Start.start;

public class InputProcessor {
    public static void Process(String[] args){
        boolean validInput = true;
        if (args.length > 0 && args.length % 2 == 0) {
            HashMap<String, String> arguments = new HashMap<>();
            int dataSources = 0;
            for (int i = 0; i < args.length; i += 2) {
                if (args[i].startsWith("-") && args[i].matches("-mode|-key|-data|-in|-out|-alg")) {
                    if (args[i].matches("-data|-in")) {
                        dataSources++;
                    }
                    arguments.put(args[i], args[i + 1]);
                } else {
                    validInput = false;
                    break;
                }
            }
            if (validInput) {
                String opt = arguments.getOrDefault("-mode", "enc");
                String key = arguments.getOrDefault("-key", "0");
                String input = arguments.getOrDefault("-data", "").replaceAll("\"", "");
                String algorithm = arguments.getOrDefault("-alg", "shift");
                String inPath = arguments.getOrDefault("-in", null);
                String outPath = arguments.getOrDefault("-out", null);

                if (dataSources == 2){
                    System.out.println(start(algorithm, opt, key, input));
                }
                else{
                    if (inPath == null || outPath == null)
                        System.out.println(start(algorithm, opt, key, input));
                    else{
                        File inFile = new File(inPath);
                        File outFile = new File(outPath);
                        try(Scanner in = new Scanner(inFile);
                            FileWriter out = new FileWriter(outFile)){
                            while(in.hasNext()){
                                input = in.nextLine();
                            }
                            String output = start(algorithm, opt, key, input);
                            out.write(output);
                        } catch (IOException e) {
                            System.out.println("Error");
                        }
                    }
                }
            } else System.out.println("check input");
        } else System.out.println("check input");
    }
}
