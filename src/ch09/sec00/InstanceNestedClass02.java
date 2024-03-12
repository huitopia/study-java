package ch09.sec00;

public class InstanceNestedClass02 {
    public static void main(String[] args) {
        MyClass02 obj01 = new MyClass02();
        MyClass02.NestedClass02 obj2 = obj01.new NestedClass02();
    }
}

class MyClass02 {
    // 인스턴스 중첩
    class NestedClass02 {
        // 필드
        // 생성자
        // 메소드
    }

    // 필드
    // 생성자
    // 메소드
    void method02() {
        NestedClass02 obj02 = new NestedClass02();
    }
}
