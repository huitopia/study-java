package ch13.sec00;

public class WildCard07 {
    public static void main(String[] args) {
        Box07<Number> box07_01 = new Box07<>();
        method1(box07_01);

        Box07<Integer> box07_02 = new Box07<>();
        method1(box07_02);

        Box07<Number> box07_03 = new Box07<>();
        method2(box07_03);

        Box07<Object> box07_04 = new Box07<>();
        // private static void method2(Box07<Number> box) 라 안됨
//        method2(box07_04);
        //private static void method2(Box07<? super Number> box)
        method2(box07_04);

    }

    /*
     * (? extends) : 상한 와일드카드(Upper Bounded Wildcard)
     * 를 사용하면 값을 안전하게 읽을 수 있다.
     * */
    private static void method1(Box07<? extends Number> box) {
        Number n = box.getItem();
    }

    /*
     * (? super) : 하한 와일드카드(Lower Bounded Wildcard)
     * 를 사용하면 값을 안전하게 읽을 수 있다.
     * */
    private static void method2(Box07<? super Number> box) {
        box.setItem(3);
        box.setItem(3.14);
    }
}

class Box07<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
