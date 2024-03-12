package ch09.sec00;

public class Anonymous12 {
    public static void main(String[] args) {
        MyInterface12 myInterface12 = new MyInterface12() {
            @Override
            public void method01() {
                System.out.println("Anonymous12.method01");
            }
        };
        myInterface12.method01();
    }
}

interface MyInterface12 {
    void method01();
}
