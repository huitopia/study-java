package ch08.sec00;

public class Test08Example {
    public static void action(A a) {
        a.method1();
        if (a instanceof C c) {
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}

interface A {
    void method1();
}

class B implements A {
    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C implements A {
    @Override
    public void method1() {
        System.out.println("C.method1");
    }

    public void method2() {
        System.out.println("C.method2");
    }
}


