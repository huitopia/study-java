package ch07.sec02.exam01;

public class Inheritance01 {
    public static void main(String[] args) {
        Child child01 = new Child();
        child01.name = "이름";
        System.out.println("child01 = " + child01.name);
        child01.method1();
    }
}

class Parent {
    // field
    public String name;

    // method
    public void method1() {
        System.out.println("method1 start");
    }

}

// extends : 부모의 멤버를 이 클래스에 상속함
class Child extends Parent {

}