package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}

class InterfaceImpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("InterfaceImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceImpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceImpl.methodC");
    }
}
