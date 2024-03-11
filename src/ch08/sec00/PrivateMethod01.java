package ch08.sec00;

public class PrivateMethod01 {
}

interface MyInterface07 {
    default void method01() {
        System.out.println("MyInterface07.method01");
        extracted();
    }

    default void method02() {
        System.out.println("MyInterface07.method02");
        extracted();
    }

    private void extracted() {
        System.out.println("중복");
    }

    static void method03() {
        System.out.println("MyInterface07.method03");
        doCommon();
    }

    static void method04() {
        System.out.println("MyInterface07.method04");
        doCommon();
    }

    private static void doCommon() {
        System.out.println("중복2");
    }
}