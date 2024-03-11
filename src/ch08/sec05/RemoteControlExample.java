package ch08.sec05;

import ch08.sec04.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;
        // Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnON(); // Tv On
        rc.setVolume(5); // 현재 TV 볼륨 : 5

        rc.setMute(true); // 무음 처리, 현재 TV 볼륨 : 0
        rc.setMute(false); // 무음 해제
        System.out.println();

        rc = new Audio();
        rc.turnON();  // Audio On
        rc.setVolume(6); // 현재 볼륨 : 6

        rc.setMute(true); // 무음, 현재 볼륨 : 0
        rc.setMute(false); // 무음 해제, 현재 볼륨 : 6

        System.out.println();
        RemoteControl.changeBattery(); // 리모콘 건전지를 교환합니다.
    }
}
