package ch09.sec00;

public class Anonymous10 {
    public static void main(String[] args) {
        Parent10 parent10 = new Parent10() {
            @Override
            void method() {
                System.out.println("Anonymous10.method 재정의");
            }
        };
        parent10.method();
    }
}

class Parent10 {
    void method() {
        System.out.println("Parent10.method");
    }
}

//class Child10 extends Parent10 {
//    @Override
//    void method() {
//        System.out.println("Child10.method");
//    }
//}
