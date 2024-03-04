package cs06.sec08.exam03;

import cs06.sec08.exam03.Car;

public class CarExample {
    public static void main(String[] args) {
        //  객체 생성
        Car myCar = new Car();
        //  리턴값이 없는 setGas() 메소드 호출
        myCar.setGas(5);
        //  isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
        if (myCar.isLeftGas()) {
            System.out.println("run");
            //  리턴값이 없는 run() 메소드 호출
            myCar.run();
        }
        System.out.println("need gas");
    }
}
