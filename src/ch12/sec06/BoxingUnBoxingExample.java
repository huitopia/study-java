package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        // 수동 unboxing, 재정의한 toString 호출
        System.out.println("obj = " + obj); // 100
        System.out.println("obj.toString() = " + obj.toString()); // 100
        // auto unboxing
        System.out.println("value: " + obj.intValue()); // 100
        // UnBoxing
        int value = obj;
        System.out.println("value = " + value); // 100
        // 연산 시 UnBoxing
        int result = obj + 100;
        System.out.println("result = " + result); // 200
    }
}
