package ch12.sec00;

public class WrapperClass01 {
    public static void main(String[] args) {
        // 기본 타입 9개를 감싼 참조타입(클래스) 8개
        // byte, short, int, long, float, double, boolean, char
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character

        int a = 3;
        Integer b = a; // 원래는 안되나 지금은 됨

        long d = 5;
        Long e = d; // auto boxing

        char h = '가';
        Character i = h;

        boolean j = true;
        Boolean k = j;

    }
}
