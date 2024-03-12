package ch09.sec00;

public class NestedInterface06 {
    public static void main(String[] args) {

    }
}

class OtherClass implements MyClass06.NestedInterface {
    @Override
    public void method() {

    }
}

class MyClass06 {
    interface NestedInterface {
        void method(); // 추상 메소드
    }

    void method1() {
        class LocalClass implements NestedInterface {
            @Override
            public void method() {
                
            }
        }
    }
}
