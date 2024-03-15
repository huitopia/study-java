package ch13.sec00;

public class Test02 {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        Container<Integer> container2 = new Container<>();

        container1.set("성이름");
        container2.set(6);

        System.out.println("container1.get() = " + container1.get());
        System.out.println("container.get() = " + container2.get());

    }
}

class Container<T> {
    private T item;

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }
}
