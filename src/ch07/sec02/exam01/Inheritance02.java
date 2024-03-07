package ch07.sec02.exam01;

public class Inheritance02 {
    public static void main(String[] args) {
        Child02 child02 = new Child02();
        child02.method01();
        child02.method02();

        Child02_01 child02_01 = new Child02_01();
        child02_01.method01();
    }

}

class Parent02 {
    public void method01() {

    }

}

class Child02 extends Parent02 {
    public void method02() {

    }
}

// 여러 클래스가 상속 받을 수 있다.
class Child02_01 extends Parent02 {

}