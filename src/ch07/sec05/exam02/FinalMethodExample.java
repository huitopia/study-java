package ch07.sec05.exam02;

public class FinalMethodExample {
}

class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("stop");
        speed = 0;
    }
}

class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // method overriding 못함
    /*public void stop() {}*/
}