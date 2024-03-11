package ch08.sec00;

public class DefaultMethod01 {
    public static void main(String[] args) {
        MyInterface05 a = new MyClass01();
        MyInterface05 b = new MyClass02();
        a.method100(); // MyInterface05.method100
        b.method100(); // MyInterface05.method100
    }
}

// @formatter:off
interface MyInterface05 {
    // 재정의 하지 않기 위해 default추가
    default void method100(){
        System.out.println("MyInterface05.method100");
    }
}
class MyClass01 implements MyInterface05{
    // default 메소드도 필요하면 재정의 가능하다
}
class MyClass02 implements MyInterface05{}
