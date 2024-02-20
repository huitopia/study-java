package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        // 컴파일 단계에서 연산
        System.out.println("result1 : " + result1); // 30

        byte b1 = 10;
        byte b2 = 20;
        int result2 = b1 + b2;
        // int 타입으로 변환 후 연산
        System.out.println("result2 : " + result2); // 30

        byte b3 = 10;
        int i1 = 100;
        long l1 = 1000L;
        long result3 = b3 + i1 + l1;
        // long 타입으로 변환 후 연산
        System.out.println("result3 : " + result3); // 1110

        char c1 = 'A';
        char c2 = 1;
        int result4 = c1 + c2;
        // int 타입으로 변환 후 연산
        System.out.println("result4 : " + result4); // 66
        System.out.println("result4 : " + (char) result4); // B

        int i2 = 10;
        int result5 = i2 / 4;
        // 정수 연산의 결과는 정수
        System.out.println("result5 : " + result5); // 2

        int i3 = 10;
        double result6 = i3 / 4.0;
        // double 타입으로 변환 후 연산
        System.out.println("result6 : " + result6); // 2.5

        int i4 = 1;
        int i5 = 2;
        double result7 = (double) i4 / i5;
        // double 타입으로 변환 후 연산
        System.out.println("result7 : " + result7); // 0.5
    }
}
