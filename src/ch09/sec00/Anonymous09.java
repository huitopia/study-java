package ch09.sec00;

public class Anonymous09 {
    public static void main(String[] args) {
        Parent09 parent09 = new Parent09() {
            @Override
            void method01() {
                System.out.println("Anonymous09.method01");
            }
        };
        parent09.method01();
    }
}

abstract class Parent09 {
    abstract void method01();
}
