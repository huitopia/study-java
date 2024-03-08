package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.breathe();

        Cat cat = new Cat();
        cat.sound();
        dog.breathe();

        // 매개변수의 다형성
        animalSound(dog);
        animalSound(cat);
    }
}
