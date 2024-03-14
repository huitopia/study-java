package ch12.sec00;

public class WrapperClass02 {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; // auto boxing
//        Long d = a; // X
//        Long d = a; // X

        Number e = a; // 다형성 auto boxing
        Object f = a;
    }
}
