package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
                System.out.println(Thread.currentThread().getName() + ": " + map.size());
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" + i);
                }
                System.out.println(Thread.currentThread().getName() + ": " + map.size());
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        int size = map.size();
        System.out.println("size = " + size);
    }
}
