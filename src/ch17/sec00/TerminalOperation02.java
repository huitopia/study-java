package ch17.sec00;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperation02 {
    public static void main(String[] args) {
        /* 최종연산
         * forEach, collect, count, reduce
         * anyMatch, allMatch
         * max, min
         */

        // Stream 만들기
        List<Integer> list = List.of(9, 8, 0, 11, 1, 90);
        Stream<Integer> stream = list.stream();
        // forEach
        stream.forEach(e -> System.out.println("e = " + e));
        list.stream().forEach(System.out::println);
        // count
        long count = list.stream().count();
        // stream은 데이터 사용 후 사라져서 재사용 불가
//        long count1 = stream.count();
        System.out.println("count = " + count);
        // max
        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        System.out.println("max = " + max);


    }
}
