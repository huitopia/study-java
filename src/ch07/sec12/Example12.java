package ch07.sec12;

public class Example12 {
    public static void action(A a) {
        a.method1();
        if (a instanceof C c) {
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }

}

class A {
    public void method1() {
        System.out.println("A-method1()");
    }
}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B-method1()");
    }
}

class C extends A {
    @Override
    public void method1() {
        System.out.println("C-method1()");
    }

    public void method2() {
        System.out.println("C-method2()");
    }
}
