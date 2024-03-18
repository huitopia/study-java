package ch13.sec00;

public class WildCard08 {
    public static void main(String[] args) {

    }

    // method1과 method2는 같다.
    public static void method1(Box07<? extends Object> box) {
        Object o = box.getItem();
    }

    public static void method2(Box07<?> box) {
        Object o = box.getItem();
    }
}


