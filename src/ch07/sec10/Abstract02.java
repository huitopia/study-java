package ch07.sec10;

public class Abstract02 {
    public static void main(String[] args) {
        Animal02 a1 = new Fish02();
        Animal02 a2 = new Cat02();
        a1.breathe();
        a1.breathe();
    }

}

abstract class Animal02 {
    // 기능은 있는데 구현은 하위에서 구현
    // abstract method : 하위 클래스가 꼭 재정의함
    // 추상메소드가 존재하면 클래스도 추상 클래스여야 한다.
    abstract public void breathe();
}

// 구현클래스(concrete class)
class Fish02 extends Animal02 {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }
}

class Cat02 extends Animal02 {
    @Override
    public void breathe() {
        System.out.println("폐 호흡");
    }
}

// 자식클래스가 추상 메소드를 재정의 하지 않으면
// 추상 클래스가 되어야한다.
abstract class Bird02 extends Animal02 {

}