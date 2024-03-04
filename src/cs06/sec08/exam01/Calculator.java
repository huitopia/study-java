package cs06.sec08.exam01;

public class Calculator {
    //  리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("on");
    }

    //  리턴값이 없는 메소드 선언
    void powerOff() {
        System.out.println("off");
    }

    //  호출 시 두 정수 값을 전달받고,
    //  호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result; //   리턴 값 지정
    }

    //  호출 시 두 정수 값을 전달받고,
    //  호출한 곳으로 결과값 double를 리턴하는 메소드 선언
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result; //   리턴 값 지정
    }
}
