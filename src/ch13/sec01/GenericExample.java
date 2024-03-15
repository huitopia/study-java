package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        // 박스 생성시 타입 파라미터 T 대신 다른 타입(String, Integer)으로 대체
        // 1번
        /*Box<String> box1 = new Box<String>();
        Box<Integer> box2 = new Box<Integer>();*/
        // 2번
        /*Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();*/
        // 3번
        var box1 = new Box<String>();
        var box2 = new Box<Integer>();

        box1.content = "hi";
        box2.content = 100;

        String str = box1.content;
        Integer i = box2.content;

        System.out.println("str = " + str);
        System.out.println("i = " + i);

        System.out.println("box1.content = " + box1.content);
        System.out.println("box2.content = " + box2.content);

    }
}

// 타입 파라미터로 T 사용
class Box<T> {
    public T content;
}
