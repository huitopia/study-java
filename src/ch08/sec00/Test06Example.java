package ch08.sec00;

public class Test06Example {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}

interface Soundable {
    public String sound();
}

class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}