package ch07.sec05.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff(); // 이륙
        sa.fly(); // 비행
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly(); // 초음속 비행(method overriding)
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly(); // 비행(parent class)
        sa.land(); // 착륙
    }
}
