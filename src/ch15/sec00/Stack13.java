package ch15.sec00;

import java.util.Stack;

public class Stack13 {
    public static void main(String[] args) {
        var stack = new Stack<String>();

        stack.push("son");
        stack.push("lee");
        // peek : 스택의 개체를 제거하지 않고 맨 위의 스택을 꺼내옴
        String item1 = stack.peek();
        String item2 = stack.peek();

        System.out.println("stack = " + stack.size());

        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
    }
}
