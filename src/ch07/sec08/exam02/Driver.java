package ch07.sec08.exam02;

public class Driver {
    // 메소드 선언(클래스 타입의 매개변수를 갖고 있음) / 매개변수 다형성
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }

    // 필드 다형성
//    public Vehicle vehicle;
//
//    public void drive() {
//        vehicle.run();
//    }
}
