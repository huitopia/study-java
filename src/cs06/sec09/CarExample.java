package cs06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("h");
        Car yourCar = new Car("k");

        myCar.setSpeed(130);
        yourCar.setSpeed(120);

        myCar.run();
        yourCar.run();
    }
}
