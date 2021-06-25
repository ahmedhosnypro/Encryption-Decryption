import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> fstQ = new ArrayDeque<>();
        Deque<Integer> lowerQ = new ArrayDeque<>();
        int fstQTotalLoad = 0;
        int lowerQTotalLoad = 0;

        int numberOfTasks = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfTasks; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] task = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
            if (fstQTotalLoad == lowerQTotalLoad) {
                fstQ.offerLast(task[0]);
                fstQTotalLoad += task[1];
            } else if (fstQTotalLoad > lowerQTotalLoad) {
                lowerQ.offerLast(task[0]);
                lowerQTotalLoad += task[1];
            } else {
                fstQ.offerLast(task[0]);
                fstQTotalLoad += task[1];
            }
        }

        fstQ.forEach(e -> System.out.print(e + " "));
        System.out.println();
        lowerQ.forEach(e -> System.out.print(e + " "));
    }
}