package ch14.sec00.p1thread;

public class C07Runnable {
    public static void main(String[] args) {
        // 람다 구현
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                System.out.println(i);

            }
        });
        thread.start();
        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
