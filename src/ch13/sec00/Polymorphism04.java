package ch13.sec00;

public class Polymorphism04 {
}

class Box04<T> {
    private T item;

    public void someMethod() {
        // item의 타입을 모르면서 실행시킬 수 있는 메소드
        // Instance의 상위 타입인 Object의 메소드는 실행 가능하다. => 모든 인스턴스의 상위 타입은 Object이다.
        System.out.println("item.hashCode() = " + item.hashCode());
        System.out.println("item.toString() = " + item.toString());
        System.out.println("item.equals(null) = " + item.equals(null));

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
