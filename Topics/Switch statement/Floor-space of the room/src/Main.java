import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine().trim();
        double floorage = 0;
        double a, b, c, r;
        switch (shape) {
            case "rectangle":
                a = Integer.parseInt(scanner.nextLine());
                b = Integer.parseInt(scanner.nextLine());
                floorage = a * b;
                break;
            case "triangle":
                a = Integer.parseInt(scanner.nextLine());
                b = Integer.parseInt(scanner.nextLine());
                c = Integer.parseInt(scanner.nextLine());
                double p = (a + b + c) / 2;
                floorage = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "circle":
                r = Integer.parseInt(scanner.nextLine());
                floorage = 3.14 * r * r;
                break;
            default:
                System.out.println("check input");
                break;
        }
        System.out.println(floorage);
    }
}