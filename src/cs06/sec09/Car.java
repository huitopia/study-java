package cs06.sec09;

public class Car {
    //  필드 선언
    String model;
    int speed;

    //  생성자 선언
    Car(String model) {
        //  매개변수를 필드에 대입
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        System.out.println("this.model = " + this.model + ", this.speed = " + this.speed);
    }
}
