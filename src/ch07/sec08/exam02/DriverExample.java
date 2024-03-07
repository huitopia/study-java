package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 매개값으로 Bus 객체 제공하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);

        Vehicle vehicle = new Vehicle();
        driver.drive(vehicle);

        // 필드 다형성
//        driver.vehicle = new Vehicle();
//        driver.drive();
//        driver.vehicle = new Bus();
//        driver.drive();
//        driver.vehicle = new Taxi();
//        driver.drive();
    }
}
