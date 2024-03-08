package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        // 추상클래스라 직접 생성 불가
        // Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone("성이름");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
