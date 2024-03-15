package ch13.sec03.exam01;

public class GenericExample {
    // Generic Method에 Type Parameter로 T 정의
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // T를 Integer로 대체
        Box<Integer> box1 = boxing(100);
        System.out.println("box1.get() = " + box1.get());
        // T를 String으로 대체
        Box<String> box2 = boxing("집 언제 가");
        System.out.println("box2.get() = " + box2.get());
    }
}
