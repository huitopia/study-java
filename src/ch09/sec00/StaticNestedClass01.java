package ch09.sec00;

public class StaticNestedClass01 {
    public static void main(String[] args) {
        MyClass01.NestedClass01 obj01 = new MyClass01.NestedClass01();
    }
}

class MyClass01 {
    //정적(static) 중첩 클래스
    static class NestedClass01 {
    }

    void method01() {
        NestedClass01 nestedClass01 = new NestedClass01();
    }
}
