package ch16.sec00;

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        SMRInterface smrInterface = StaticMethodReferenceExample::staticMethod;

    }

    static void staticMethod(String a, int b) {
        System.out.println(a + b);
    }
}

@FunctionalInterface
interface SMRInterface {
    void method(String a, int b);
}