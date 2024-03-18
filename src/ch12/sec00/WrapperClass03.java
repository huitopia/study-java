package ch12.sec00;

public class WrapperClass03 {
    public static void main(String[] args) {
        // 기본 > 참조
        int a = 5;
        Integer b = 5; // auto boxing
        Number c = a; // auto boxing
        Object d = a; // auto boxing

        Integer e = null; // ok
//        int f = null; // 값 자체가 없기 때문에 null 사용 불가능

    }
}
