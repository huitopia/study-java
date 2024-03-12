package ch09.sec04.exam03;

public class A {
    public void method1(int arg) { // final int arg
        int var = 1; // final int var = 1;
        class B { // 로컬 클래스
            void method2() {
                // 로컬변수 읽기
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);
            }
        }
        B b = new B(); // 로컬 객체 생성
        b.method2(); // 로컬 객체 메소드 호출
    }
}
