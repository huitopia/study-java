package ch09.sec02.exam02;

public class A {
    class B { // 인스턴스 멤버 클래스
        int field1 = 1; // 인스턴스 필드
        static int field2 = 2; // 정적 필드

        B() { // 생성자
            System.out.println("B.B");
        }

        void method01() { // 인스턴스 메소드
            System.out.println("B.method01");
        }

        static void method02() { // 정적 메소드
            System.out.println("B.method02");
        }

    }

    void useB() { // 인스턴스 메소드
        // B 객체 생성 및 인스턴스 필드 및 메소드 사용
        B b = new B();
        System.out.println("b.field1 = " + b.field1);
        b.method01();
        // B 클래스의 정적 필드 및 메소드 사용
        System.out.println("B.field2 = " + B.field2);
        B.method02();
    }
}
