package ch13.sec00;

public class Polymorphism05 {
    Box05<Number> box05 = new Box05<>();
    Box05<Integer> box05_1 = new Box05<Integer>();
    Box05<Double> box05_2 = new Box05<Double>();
}

class Box05<T extends Number> {
    private T item;

    public void someMethod() {
        item.intValue();

    }

}
