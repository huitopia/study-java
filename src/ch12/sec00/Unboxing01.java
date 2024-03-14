package ch12.sec00;

public class Unboxing01 {
    public static void main(String[] args) {
        // 참조 > 기본
        Integer a = 3; // auto boxing
        int b = a; // auto unboxing

        Long d = 5L;
        long e = d; // auto unboxing
        double f = e; // 기본 타입 형변환
        double g = d; // auto unboxing + 기본 타입 형변환

        System.out.println("실행 종료");
    }
}
