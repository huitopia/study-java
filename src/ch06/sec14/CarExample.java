package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 잘못된 속도로 setSpeed에서 0처리
        myCar.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        // 올바른 속도로 setSpeed 통과
        myCar.setSpeed(60);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        //
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
