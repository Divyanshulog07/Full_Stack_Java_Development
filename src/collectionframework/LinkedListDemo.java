package collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        list1.addFirst(5);
        list1.addLast(45);
        System.out.println(list1);
        // add and offer does the same work

        list1.offer(60);
        list1.add(70);
        System.out.println(list1);


    }
}
