package ch09.sec03.exam02;

public class A {
    // 정적 멤버 클래스
    static class B {
        // 인스턴스 필드
        int field1 = 1;
        // 정적 필드
        static int field2 = 2;

        // 생성자
        B() {
            System.out.println("B.B");
        }

        // 인스턴스 메소드
        void method01() {
            System.out.println("B.method01");
        }

        // 정적 메소드
        static void method02() {
            System.out.println("B.method02");
        }
    }

}
