import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length(); i++){
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        System.out.println(sb);
    }
}