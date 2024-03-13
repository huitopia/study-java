package ch16.sec00;

public class Sample07 {
    public static void main(String[] args) {
//    hi -> hihihi
        MyInterface07 myInterface07_01 = a -> System.out.println(a + a + a);
//    hello -> hellohello
        MyInterface07 myInterface07_02 = a -> System.out.println(a + a);
//    spring -> SPRING
        MyInterface07 myInterface07_03 = a -> System.out.println(a.toUpperCase());
        myInterface07_01.method("hi");
        myInterface07_02.method("hello");
        myInterface07_03.method("spring");
    }
}

interface MyInterface07 {
    void method(String a);
}
