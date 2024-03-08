package ch07.sec05;

public class Final01 {

}

class Parent01 {
    // 자식 클래스가 재정의 못하게 막음
    final public void method01() {
        System.out.println("Parent01.method01");
    }

}

class Child01 extends Parent01 {

}
