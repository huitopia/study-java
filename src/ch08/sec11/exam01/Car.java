package ch08.sec11.exam01;

public class Car {
    // field
    Tire tire01 = new Hankook();
    Tire tire02 = new Hankook();

    // method
    void run() {
        tire01.roll();
        tire02.roll();
    }
}
