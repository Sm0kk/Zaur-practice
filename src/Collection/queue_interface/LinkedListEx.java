package Collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("oleg");
        queue.add("Mariya");
        queue.add("Aleks");
        queue.offer("DWAD");
        System.out.println(queue);


     /*   System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        queue.peek();*/

    }
}
