package ch14.sec00.p2concurrency;

public class C02SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        MyObject02 o = new MyObject02();

        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class MyObject02 implements Runnable {
    private long val;
    private Object lock;

    public long getVal() {
        return val;
    }
    

    public void update() {
        for (int i = 0; i < 30000; i++) {
            // () 안의 객체를 차지한 Thread 만 실행 가능
            synchronized (this) {
                val++;
            }
        }
        System.out.println(Thread.currentThread().getName() + ": " + getVal());
    }

    @Override
    public void run() {
        update();
    }
}
