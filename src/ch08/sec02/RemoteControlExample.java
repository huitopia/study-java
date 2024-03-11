package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        // rc 변수에 객체 대입
        rc = new Television();
        // 추상 메소드 호출
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}

interface RemoteControl {
    // 추상 메소드
    void turnOn();
}

class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Audio ON");
    }
}

class Television implements RemoteControl {
    // 인터페이스에 선언된 turnOn() 추상 메소드 재정의
    @Override
    public void turnOn() {
        System.out.println("TV ON");
    }
}
