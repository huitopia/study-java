package ch16.sec00;

public class InstanceMethodReferenceExample {
    public static void main(String[] args) {
        IMROtherClass imrOtherClass = new IMROtherClass();
        // 변경 전
        IMRInterface imrInterface01 = (x, y) -> {
            imrOtherClass.method01(x, y);
        };
        // 변경 후
        IMRInterface imrInterface02 = imrOtherClass::method01;
    }
}

class IMROtherClass {
    void method01(int a, int b) {
        System.out.println(a + b);
    }
}

@FunctionalInterface
interface IMRInterface {
    void method(int a, int b);
}
