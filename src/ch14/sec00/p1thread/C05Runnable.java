package ch14.sec00.p1thread;

public class C05Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread05());
        thread.start();
        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }


    }
}

/*
 * Thread 생성 방법
 * 2. Runnable Interface 구현
 * run method 재정의
 */
class MyThread05 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}
