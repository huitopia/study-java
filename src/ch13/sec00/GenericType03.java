package ch13.sec00;

public class GenericType03 {
    public static void main(String[] args) {
        Box03<String, Integer> box1 = new Box03<>();
        var box2 = new Box03<Double, String>();

        box1.setItem1("java");
        box1.setItem2(200);

        box2.setItem2("java");
        box2.setItem1(0.5);
    }
}

class Box03<T1, T2> {
    private T2 item2;
    private T1 item1;

    public T1 getItem1() {
        return item1;
    }

    public void setItem1(T1 item1) {
        this.item1 = item1;
    }

    public T2 getItem2() {
        return item2;
    }

    public void setItem2(T2 item2) {
        this.item2 = item2;
    }
}
