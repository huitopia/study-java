package ch02.sec07;
public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue); // intValue : 10

        char chatValue = '가';
        intValue = chatValue;
        System.out.println("유니코드 : " + intValue); // 44032

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue); // 50

        longValue = 100;
        float flaotValue = longValue;
        System.out.println("floatValue : " + flaotValue); // 100.0

        flaotValue = 100.5F;
        double doubleValue = flaotValue;
        System.out.println("doubleValue : " + doubleValue); // 100.5
    }
}
