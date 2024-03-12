package ch09.sec00;

public class Anonymous11 {
    public static void main(String[] args) {
        // 1
        Parent11 parent11 = new Parent11() {
        };
        method(parent11);

        // 2
        method(new Parent11() {
        });
    }

    public static void method(Parent11 param) {

    }
}

abstract class Parent11 {

}