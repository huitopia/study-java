package ch14.sec00.p1thread;

public class C03Thread {
    public static void main(String[] args) {
        /*
         * Thread 만들기
         * 1. Thread Class 상속
         * -> run method Override
         * 2. Runnable Interface 구현
         * -> run method Override
         */

        // Thread 시작 방법
        MyThread03 thread03 = new MyThread03(); // 객체 생성
        // start method 실행시키면 JVM 이 알아서 run method 실행시킴
        thread03.start();
        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}

/* 1 */
class MyThread03 extends Thread {
    @Override
    public void run() {
        // Thread 가 할 일
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }

    }
}
