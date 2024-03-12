package ch09.sec00;

public class Anonymous08 {
    public static void main(String[] args) {
        /* 익명 객체 */
        Parent08 parent08 = new Parent08() {
            @Override
            void method01() {
                System.out.println("재정의");
            }
        };
        parent08.method01();
    }
}

abstract class Parent08 {
    void method01() {
        System.out.println("Parent08.method01");
    }
}
