package ch16.sec00;

public class AnonymousInstanceMethodReferenceExample {
    public static void main(String[] args) {
        AIMROtherClass aimrOtherClass = new AIMROtherClass();
        AIMRInterface aimrInterface = aimrOtherClass::method001;
    }
}

class AIMROtherClass {
    void method001(int x) {
        System.out.println("아 모르겠다.");
    }

    void method001(AIMROtherClass aimrOtherClass, int x) {
    }
}

@FunctionalInterface
interface AIMRInterface {
    void method(AIMROtherClass obj, int x);
}
