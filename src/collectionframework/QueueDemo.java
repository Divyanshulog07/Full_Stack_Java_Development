package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(40);
        queue.offer(50);
        System.out.println(queue);
        System.out.println(queue.remove()); //--> Returns exception
        System.out.println(queue.poll());   //--> Returns Null
        System.out.println(queue.element());//--> Returns exception
        System.out.println(queue.peek());   //--> Returns Null  
    }
}
