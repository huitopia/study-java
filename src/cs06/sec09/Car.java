package cs06.sec09;

public class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        System.out.println("this.model = " + this.model);
        System.out.println("this.speed = " + this.speed);
    }
}
