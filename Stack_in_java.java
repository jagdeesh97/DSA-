import java.util.Stack;

public class Stack_in_java {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Hi");
        stack.push("I");
        stack.push("Love");
        stack.push("My");
        stack.push("India");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
    }
}
