package ch12.sec00;

public class HashCode06 {
    // 재정의 하지 않은 hashcode
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = new String("spring");
        System.out.println("s1 = " + s1.hashCode()); // 3254818
        System.out.println("s2 = " + s2.hashCode()); // 3254818
        System.out.println("s3 = " + s3.hashCode()); // -895679987
        // s1과 s2는 다른 객체지만 같은 값이 나온다.
        System.out.println("s1 == s2: " + s1 == s2); // false
        // 실제 값
        System.out.println(System.identityHashCode(s1)); // 1067040082
        System.out.println(System.identityHashCode(s2)); // 1325547227
        System.out.println(System.identityHashCode(s3)); // 980546781
    }
}
