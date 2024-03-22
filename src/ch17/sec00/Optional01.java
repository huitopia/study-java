package ch17.sec00;

import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {
        /*
         * Optional
         * null 이 아닌 값을 포함할 수 있는 컨테이너 ➡️null 안됨
         */

        Optional<String> s = Optional.of("java");
        Optional<Integer> i = Optional.of(3);
        Optional<Double> v = Optional.of(3.14);
//        Optional<Object> o = Optional.of(null); (X)
        // 빈 컨테이너 생성
        Optional<Object> container1 = Optional.empty();
        // 값 확인
        System.out.println("### 빈 값 여부 확인");
        boolean present1 = s.isPresent();
        boolean present2 = container1.isPresent();
        System.out.println("present1 = " + present1);
        System.out.println("present2 = " + present2);
        // 값 없는지
        System.out.println("### 값 없는지 확인");
        boolean empty1 = s.isEmpty();
        boolean empty2 = container1.isEmpty();
        System.out.println("empty1 = " + empty1);
        System.out.println("empty2 = " + empty2);
        // 값 출력
        System.out.println("### 값 출력");
        String s1 = s.get();
        Integer i1 = i.get();
//        Object o = container1.get(); (X)
        System.out.println("s1 = " + s1);
        System.out.println("i1 = " + i1);
        // 빈 값 출력
        System.out.println("### 빈 값 출력");
        String s2 = s.orElse("");
        Integer i2 = i.orElse(0);
        Object o = container1.orElse(new Object());
        System.out.println("s2 = " + s2);
        System.out.println("i2 = " + i2);
        System.out.println("o = " + o);


    }
}
