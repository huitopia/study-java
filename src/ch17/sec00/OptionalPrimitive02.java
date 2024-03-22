package ch17.sec00;

import javax.swing.text.html.Option;
import java.util.OptionalInt;

public class OptionalPrimitive02 {
    public static void main(String[] args) {
        /*
         * OptionalInt : 기본타입 int 값을 가지고 있을 수 있는 컨테이너
         * OptionalDouble : double 값을 가지고 있을 수 있는 컨테이너
         * OptionalLong : long 값을 가지고 있을 수 있는 컨테이너
         */

        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.of(50);
        OptionalInt o3 = OptionalInt.empty();

        // isPresent : 값 여부 판단
        // isEmpty : 값 없는지 판단
        o1.isPresent(); // true
        o3.isPresent(); // false
        o1.isEmpty(); // false
        o3.isEmpty(); // true

        // getAsInt : 값 출력 (없으면 Exception)
        o1.getAsInt(); // 3
        o3.getAsInt(); // Exception
        // orElse : 값 없으면 기본값 출력
        o1.orElse(0); // 3
        o3.orElse(0); // 0
    }
}
