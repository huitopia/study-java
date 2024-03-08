package ch07.sec10;

public class Abstract01 {
    public static void main(String[] args) {
        Animal01 a1 = new Tiger01();
        Animal01 a2 = new Cat01();

        // 추상 클래스로 인스턴스 생성 불가
//        Animal01 c1 = new Animal01()

    }
}

abstract class Animal01 {
}

class Tiger01 extends Animal01 {
}

class Cat01 extends Animal01 {
}
