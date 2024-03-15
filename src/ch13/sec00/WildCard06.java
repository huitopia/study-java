package ch13.sec00;

public class WildCard06 {
    public static void main(String[] args) {
        Integer v1 = 100;
        Number v2 = v1;
        Double v3 = 3.14;
        Number v4 = v3;
        Object v5 = v2;
        Object v6 = v4;

        Box06<Integer> box06_01 = new Box06<>();
//        Number > Integer 이더라도 이건 안됨
//        Box06<Number> box06_02 = box06_01;
        // Number 또는 ?(하위타입)으로 결정됐을 때 가능
        Box06<? extends Number> box06_02 = box06_01;
        Box06<Double> box06_03 = new Box06<>();
        Box06<? extends Number> box06_04 = box06_03;
        Box06<Object> box06_05 = new Box06<>();
//        Object는 Number의 상위 타입이라 안됨
//        Box06<? extends Number> box06_06 = box06_05;
        // Number의 ? super(상위 타입)이라 됨
        Box06<? super Number> box06_06 = box06_05;
    }
}

class Box06<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
