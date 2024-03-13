package ch16.sec00;

public class Lambda01 {
    public static void main(String[] args) {
        MyInterface01 myInterface01 = () -> System.out.println("재정의1");
        myInterface01.method();
    }
}

// 추상 메소드가 하나인 인터페이스의 익명클래스 객체 생성시 람다 표현식으로 코드 간단하게 작성 가능
interface MyInterface01 {
    void method();
}