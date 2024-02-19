package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println(var1); // 0.12345679
        System.out.println(var2); // 0.12345678901234568
    }
}
