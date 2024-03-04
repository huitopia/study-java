package cs06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("my");
        Car yourCar = new Car("your");

        myCar.setSpeed(130);
        yourCar.setSpeed(120);

        myCar.run();
        yourCar.run();
    }
}
