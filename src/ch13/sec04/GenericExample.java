package ch13.sec04;

public class GenericExample {
    public static <T extends Number> boolean compare(T t1, T t2) {
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        // Number 타입의 douleValue() 메소드 호출
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        // T를 Integer 타입으로 대체
        boolean result1 = compare(10, 20);
        System.out.println("result1 = " + result1); // false
        System.out.println();
        // T를 Double 타입으로 대체
        boolean result2 = compare(4.5, 4.5);
        System.out.println("result2 = " + result2); // true
        System.out.println();
    }
}
