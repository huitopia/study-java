package ch09.sec04.exam01;

public class A {
    A() { // 생성자
        class B { // 로컬 클래스 선언
        }
        B b = new B(); // 로컬 객체 선언
    }

    void method() { // 메소드
        class B { // 로컬 클래스 선언
        }
        B b = new B(); // 로컬 객체 선언
    }
}
