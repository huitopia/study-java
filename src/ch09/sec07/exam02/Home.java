package ch09.sec07.exam02;

public class Home {
    // 필드에 익명 구현 객체 대입
    private RemoteControl remoteControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV ON");
        }

        @Override
        public void turnOff() {
            System.out.println("TV OFF ");
        }
    };

    void use1() { // 메소드(필드 이용)
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

    // 메소드(로컬 변수 이용)
    void use2() {
        RemoteControl remoteControl = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 가동");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 종료");
            }
        };
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

    // 메소드(매개변수 이용)
    public void use3(RemoteControl remoteControl) {
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
