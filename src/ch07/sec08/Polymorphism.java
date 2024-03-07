package ch07.sec08;

public class Polymorphism {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.breathe();
        fish.swim();
        Cat cat = new Cat();
        cat.breathe();
        cat.walk();

        // 상위 타입 형변환
        Animal animal = fish;
        animal.breathe();
        // 대입이라 실제 진행되는 메소드는 자식 클래스임
        animal = cat;
        animal.breathe();
    }
}

class Animal {
    public void breathe() {
        System.out.println("호흡");
    }
}

class Fish extends Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim() {
        System.out.println("헤엄치다");
    }
}

class Cat extends Animal {
    @Override
    public void breathe() {
        System.out.println("폐 호흡");
    }

    public void walk() {
        System.out.println("걷다");
    }
}
