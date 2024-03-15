package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
    @Override
    // 타입 파라미터 P를 Car 대체하고 Rentable 리턴 타입이 P이기 때문에
    // 반드시 리턴 타입이 Car 되어야 함
    public Car rent() {
        return new Car();
    }
}
