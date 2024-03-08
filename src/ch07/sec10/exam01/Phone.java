package ch07.sec10.exam01;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("on");
    }

    void turnOff() {
        System.out.println("off");
    }

}
