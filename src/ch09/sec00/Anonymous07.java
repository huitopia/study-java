package ch09.sec00;

public class Anonymous07 {
    public static void main(String[] args) {
        /* 익명클래스의 객체 : 구현 클래스 없이 추상 클래스의 객체 생성 */
        MyClass07 myClass07 = new MyClass07() {
        };
    }
}

abstract class MyClass07 {
}
