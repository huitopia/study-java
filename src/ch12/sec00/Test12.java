package ch12.sec00;

public class Test12 {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2); // true
        System.out.println(obj3 == obj4); // false
        /* obj1, obj2 int의 초과되지 않은 범위로 같은 객체 번지를 공유하여 true이고,
        obj3, obj4는 초과 범위로 다른 객체 번지를 공유하여 false이다. */
        System.out.println("obj1의 객체 번지 = " + System.identityHashCode(obj1)); // 167625700
        System.out.println("obj2의 객체 번지 = " + System.identityHashCode(obj2)); // 167625700
        System.out.println("obj3의 객체 번지 = " + System.identityHashCode(obj3)); // 1067040082
        System.out.println("obj4의 객체 번지 = " + System.identityHashCode(obj4)); // 1325547227
        /* 대입 연산자는 참조 변수의 객체 번지를 비교하므로 내부 값을 비교하고 싶으면 equals()를 사용한다. */
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj3.equals(obj4)); // true
    }
}
