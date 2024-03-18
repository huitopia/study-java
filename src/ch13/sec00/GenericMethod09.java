package ch13.sec00;

public class GenericMethod09 {
    public static void main(String[] args) {
        Box07<String> box07 = new Box07<>();
        // java는 메소드 파라미터로 type 파라미터 유추
        method("hello");
        method(0.5);

        String str = method01(); // String 유추
        Integer i = method01(); // Integer 유추

    }

    // 제네릭 메소드 : 타입 파라미터에 메소드 붙음
    public static <T> void method(T param) {

    }

    public static <T> T method01() {
        return null;
    }

}
