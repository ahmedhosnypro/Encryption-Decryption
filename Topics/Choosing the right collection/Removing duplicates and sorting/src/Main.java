import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int  sizeOfStringSequence = Integer.parseInt(scanner.nextLine().trim());

        Set<String> strings = new TreeSet<>();

        for (int i=0; i<sizeOfStringSequence; i++){
            strings.add(scanner.nextLine().trim());
        }

        strings.forEach(System.out::println);
    }
}