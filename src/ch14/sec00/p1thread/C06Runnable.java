package ch14.sec00.p1thread;

public class C06Runnable {
    public static void main(String[] args) {
        // 익명 클래스 객체
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.err.println(i);
                }

            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
