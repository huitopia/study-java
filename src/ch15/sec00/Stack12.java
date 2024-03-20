package ch15.sec00;

import java.util.Stack;

public class Stack12 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("react");
        stack.push("spring");
        stack.push("css");

        System.out.println("stack.size() = " + stack.size()); // 4

        String item1 = stack.pop(); // css
        String item2 = stack.pop(); // react
        String item3 = stack.pop(); // spring
        String item4 = stack.pop(); // java

        System.out.println("stack.size() = " + stack.size());

        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
        System.out.println("item3 = " + item3);
        System.out.println("item4 = " + item4);

    }
}
