package ch12.sec00;

public class Compare01 {
    public static void main(String[] args) {
        int a = 7000;
        int b = 7000;
        System.out.println(a == b); // true
        Integer c = 70000;
        Integer d = 70000;

        System.out.println(c == d); // false
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        /* 참조 타입끼리 비교는 equals 사용 */
        System.out.println(c.equals(d)); // true

    }
}
