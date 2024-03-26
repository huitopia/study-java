package ch14.sec00.p2concurrency;

public class C03SynchronizedMethod {
    public static void main(String[] args) throws InterruptedException {
        MyObject03 o = new MyObject03();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("o.getVal() = " + o.getVal());
    }
}

class MyObject03 implements Runnable {
    private long val;

    public long getVal() {
        return val;
    }

    public synchronized void update() {
        for (int i = 0; i < 30000; i++) {
            val++;
        }
        System.out.println(Thread.currentThread().getName() + ": " + val);
    }

    @Override
    public void run() {
        update();
    }
}
