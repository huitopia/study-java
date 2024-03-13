package ch16.sec00;

public class FunctionalInterface01 {
}

// @FunctionalInterface - 추상 메소드가 없음
interface MyInterface03 {
}

@FunctionalInterface
interface MyInterface03_01 {
    void method01();
}

// @FunctionalInterface - 추상 메소드 2개
interface MyInterface03_02 {
    void method02();

    void method03();
}

@FunctionalInterface
interface MyInterface03_03 {
    void method04();

    default void method2() {
    }
}

@FunctionalInterface
interface MyInterface03_04 {
    void method05();

    String toString();

    int hashCode();

    boolean equals(Object o);
}