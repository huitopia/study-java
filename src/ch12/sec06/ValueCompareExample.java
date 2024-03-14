package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        // -128 ~ 127 초과값일 경우 다른 객체를 사용하여 번지가 다르다.
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2)); // false
        System.out.println(System.identityHashCode(obj1)); // 168423058
        System.out.println(System.identityHashCode(obj2)); // 821270929
        System.out.println("equals(): " + obj1.equals(obj2)); // true
        System.out.println();
        // -128 ~ 127 범위값일 경우 같은 객체를 사용하여 번지가 같다.
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==: " + (obj3 == obj4)); // true
        System.out.println(System.identityHashCode(obj3)); // 1919334762
        System.out.println(System.identityHashCode(obj4)); // 1919334762
        System.out.println("equals(): " + obj3.equals(obj4)); // true
    }
}
