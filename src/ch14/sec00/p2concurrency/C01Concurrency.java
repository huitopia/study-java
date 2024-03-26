package ch14.sec00.p2concurrency;


public class C01Concurrency {
    public static void main(String[] args) throws InterruptedException {
        MyRun01 r = new MyRun01();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        System.out.println("r.getVal() = " + r.getVal());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("r.getVal() = " + r.getVal());

    }
}

class MyRun01 implements Runnable {
    private long val;

    public long getVal() {
        return val;
    }


    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            val++;
        }
    }
}