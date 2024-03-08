package ch07.sec10.exam02;

abstract public class Animal {
    public void breathe() {
        System.out.println("호흡을 합니다.");
    }

    // 추상메소드
    public abstract void sound();
}
