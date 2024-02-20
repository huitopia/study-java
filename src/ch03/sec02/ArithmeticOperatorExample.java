package ch03.sec02;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;
        /*
         * 1. result 앞 타입으로 자동 변환
         * 2. 연산
         */
        int result1 = v1 + v2;
        System.out.println("result1 : " + result1); // 10 + 4 = 14

        long result2 = v1 + v2 - v4;
        System.out.println("result2 : " + result2); // 10 + 4 - 10

        double result3 = (double) v1 / v2; // 강제 변환 후 연산
        System.out.println("result3 : " + result3); // 10 / 4

        int result4 = v1 % v2;
        System.out.println("result4 : " + result4); // 10 / 4
    }
}
