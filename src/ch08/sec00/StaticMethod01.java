package ch08.sec00;

public class StaticMethod01 {
    public static void main(String[] args) {
        MyInterface06.method01();
    }
}

interface MyInterface06 {
    static void method01() {
        System.out.println("MyInterface06.method01");
    }
}
