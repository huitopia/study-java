package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        // 코드를 실행하는 스레드 객체 참조 얻기
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행"); // getName : main

        for (int i = 0; i < 3; i++) {
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    // getName() method 는 Thread instance method 로 thread name return
                    System.out.println(getName() + " 실행"); // getName : Thread-0,1,...
                }
            };
            t1.start();
        }
        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        // 그냥 실행하면 Thread-3 이라 setName method 로 name 부여하여 변경
        chatThread.setName("chat-thread");
        chatThread.start();
    }
}
