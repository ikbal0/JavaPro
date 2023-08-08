package stackQueue;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("after push: " + stack);
        System.out.println("size after push: " + stack.size());
        System.out.println(stack.pop());
        // see the last in
        System.out.println(stack.peek());
        System.out.println("size after pop and peek: " + stack.size());
        System.out.println("after pop and peek: " + stack);
    }
}
