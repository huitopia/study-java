package ch15.sec00;

import java.util.LinkedList;
import java.util.Queue;

public class Queue14 {
    public static void main(String[] args) {
        // interface라 객체 생성 불가
        // Queue<String> queue = new Queue<>();
        Queue<String> queue = new LinkedList<>();

        // 아이템 추가(offer)
        queue.offer("java");
        queue.offer("spring");
        queue.offer("jdbc");
        queue.offer("mongodb");
        System.out.println("queue = " + queue); // [java, spring, jdbc, mongodb]

        // 아이템 꺼내기(poll)
        String e1 = queue.poll(); // java
        String e2 = queue.poll(); // spring
        String e3 = queue.poll(); // jdbc
        String e4 = queue.poll(); // mongodb
        System.out.println("queue = " + queue); // []
    }
}
