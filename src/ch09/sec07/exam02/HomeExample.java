package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home(); // 객체 생성
        home.use1(); // 익명 구현 객체가 대입된 필드 사용
        home.use2(); // 익명 구현 객체가 대입된 로컬 변수 사용
        home.use3(new RemoteControl() { // 익명 구현 객체가 대입된 매개변수 사용
            @Override
            public void turnOn() {
                System.out.println("난방 킴");
            }

            @Override
            public void turnOff() {
                System.out.println("난방 끔");
            }
        });
    }
}