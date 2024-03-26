package ch14.sec00.p1thread;

public class C08Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                System.err.println(i);
            }
        });
        thread.start(); // Thread 시작
        thread.join(); // 현재 Thread 가 thread 의 종료를 기다림
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}
