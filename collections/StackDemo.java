package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Adam");
        stack.push("Jow");
        stack.push("Ana");
        stack.push("Daniel");
        stack.push("Katy");
        stack.push("Alam");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
