package ch16.sec00;

import java.util.Arrays;

public class Lambda04 {
    public static void main(String[] args) {
        /* 1번 */
        MyInterface04_01 myInterface04_01_01 = (int a, int b) -> {
            System.out.println("Lambda04.main");
            System.out.println(a + b);
        };
        MyInterface04_01 myInterface04_01_02 = (a, b) -> {
            System.out.println(a * b);
        };
        // 명령문이 한 줄이면 중괄호 생략 가능
        MyInterface04_01 myInterface04_01_03 = (a, b) -> System.out.println(a / b);

        myInterface04_01_01.method01(10, 12);
        myInterface04_01_02.method01(7, 9);
        myInterface04_01_03.method01(8, 4);
        /* 2번 */
        MyInterface04_02 myInterface04_02 = a -> {
            System.out.println("Lambda04.main");
            System.out.println("a = " + a);
        };
        MyInterface04_02 myInterface04_02_01 = x -> {
            System.out.println("x = " + x);
        };
        myInterface04_02.method02(10);
        myInterface04_02_01.method02(20);
        /* 3번 */
        MyInterface04_03 myInterface04_03_01 = () -> System.out.println("Lambda04.main");
        myInterface04_03_01.method03();
        /* 4번 */
        MyInterface04_04 myInterface04_04_01 = () -> {
            System.out.println("statement...");
            return 0;
        };
        MyInterface04_04 myInterface04_04_02 = () -> 0; // 한 줄이면 return 문 생략
        myInterface04_04_01.method04();
        myInterface04_04_02.method04();
    }
}


// * 1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
interface MyInterface04_01 {
    void method01(int a, int b);
}

// * 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
@FunctionalInterface
interface MyInterface04_02 {
    void method02(int a);
}

// * 3. 매개변수가 없고 리턴이 없는 추상 메소드
@FunctionalInterface
interface MyInterface04_03 {
    void method03();
}

// * 4. 리턴 있는 추상 메소드
@FunctionalInterface
interface MyInterface04_04 {
    int method04();
}
