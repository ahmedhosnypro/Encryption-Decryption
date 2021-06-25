// You can experiment here, it won’t be checked

import java.util.Deque;
import java.util.LinkedList;

public class Task {
  public static void main(String[] args) {
    // put your code here
    Deque<Integer> deq = new LinkedList<>();
    deq.offerFirst(10);
    deq.peekFirst();
    deq.offerFirst(20);
    deq.offerLast(30);
    deq.peekLast();
    deq.pollFirst();
    deq.offerLast(40);
  }
}
