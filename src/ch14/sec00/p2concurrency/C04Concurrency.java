package ch14.sec00.p2concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class C04Concurrency {
    public static void main(String[] args) throws InterruptedException {
        MyObject04 o = new MyObject04();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("o.getVal(): " + o.getVal());
    }
}

class MyObject04 implements Runnable {
    //    private long val;
    private AtomicLong val;

    public MyObject04() {
        this.val = new AtomicLong();
    }

    public long getVal() {
//        return val;
        return val.longValue();
    }

    public void update() {
        for (int i = 0; i < 30000; i++) {
//            val++;
            val.getAndIncrement();
        }
        System.out.println(Thread.currentThread().getName() + ": " + getVal());
    }

    @Override
    public void run() {
        update();
    }
}