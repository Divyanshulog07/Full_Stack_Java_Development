package collectionframework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO-->Last In First Out
        // FILO-- First In Last Out

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(20));
        System.out.println(stack.remove(2));
    }
}
