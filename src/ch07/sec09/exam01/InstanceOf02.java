package ch07.sec09.exam01;

public class InstanceOf02 {
    public static void main(String[] args) {
        A a = new E();
        System.out.println(a instanceof A); // true
        System.out.println(a instanceof B); // true
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println(a instanceof E); // true
        System.out.println(a instanceof F);

    }
}

// @formatter:off
class A {
}

class B extends A {
}

class D extends B {
}

class E extends B {
}

class C extends A {
}

class F extends C {
}
