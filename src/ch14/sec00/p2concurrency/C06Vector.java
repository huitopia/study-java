package ch14.sec00.p2concurrency;

import java.util.List;
import java.util.Vector;

public class C06Vector {
    public static void main(String[] args) throws InterruptedException {
        List<String> vector = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                vector.add("a");
                vector.remove("a");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                vector.add("b");
                vector.remove("b");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // ArrayList 했을 때 ArrayIndexOutOfBoundsException 발생
        // Vector 로 변경하면 예외 발생 안함
        System.out.println("vector = " + vector);
    }
}
