package Collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque); //1.5.3.7.8
        System.out.println(deque.getFirst()); // 1
        System.out.println(deque.getLast()); // 8
        System.out.println(deque.removeFirst()); // 1
        System.out.println(deque); //5.3.7.8
        System.out.println(deque.peekFirst()); // 5
        System.out.println(deque.peekLast()); // 8
        System.out.println(deque.removeLast()); // 8
        System.out.println(deque); // 5.3.7
        System.out.println(deque.pollFirst()); // 5
        System.out.println(deque); // 3.7
        System.out.println(deque.pollLast()); // 7
        System.out.println(deque); // 3
    }
}
