package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight(); // Home.turnOnLight

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run(); // Car.run
    }
}
