package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car myCar = new Car();
        // run() 메소드 실행
        myCar.run();
        // 타이어 객체 교체
        myCar.tire01 = new Kumho();
        myCar.tire02 = new Kumho();
        // run() 메소드 실행(다형성: 실행 결과가 다름)
        myCar.run();
    }
}
