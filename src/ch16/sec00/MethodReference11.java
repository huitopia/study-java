package ch16.sec00;

public class MethodReference11 {
    public static void main(String[] args) {
        /* 1 */
        MyInterface11_01 myInterface11_01_01 = (param1, param2) -> {
            staticMethod(param1, param2);
        };
        // parameter 값이 변경 없이 그냥 쓰인다면 줄일 수 있다.
        MyInterface11_01 myInterface11_01_02 = MethodReference11::staticMethod;

        /* 2 */
        OtherClass11_02 otherClass11_02 = new OtherClass11_02();
        MyInterface11_02 myInterface11_02 = otherClass11_02::someMethod;

        /* 3 */
        OtherClass11_03 otherClass11_03 = new OtherClass11_03();
        MyInterface11_03 myInterface11_03 = (a, b) -> a.someMethod(b);
        MyInterface11_03 myInterface11_03_01 = otherClass11_03::someMethod;
    }

    /* 1 */
    static void staticMethod(String a, int b) {
        System.out.println(a + b);
    }
}

/* 2 */
class OtherClass11_02 {
    void someMethod(int a, int b) {
        System.out.println("어떤 일을함... 중요하지 않음...");
    }
}

/* 3 */
class OtherClass11_03 {
    public void someMethod(int x) {
        System.out.println("이게 맞나");
    }

    public void someMethod(OtherClass11_03 otherClass1103, int i) {
    }
}

// 메소드 참조
// 1. static method
@FunctionalInterface
interface MyInterface11_01 {
    void method(String a, int b);
}

// 2. instance method
@FunctionalInterface
interface MyInterface11_02 {
    void method(int x, int y);
}

// 3. 임의 객체 인스턴스 메소드 참조
@FunctionalInterface
interface MyInterface11_03 {
    void method(OtherClass11_03 obj, int x);
}
// 4. 생성자 참조
