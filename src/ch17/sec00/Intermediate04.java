package ch17.sec00;

import java.util.List;
import java.util.stream.Stream;

public class Intermediate04 {
    /*
     * 중간연산(Intermediate Operation)
     * filter, map, distinct, sorted, peek, limit, skip
     * 중간연산은 최종연산이 있을 때만 실행
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 9, 8, 1, 6, 4);

        Stream<Integer> stream1 = list.stream();

        Stream<Integer> stream2 = stream1.filter(e -> {
            System.out.println("### stream2");
            System.out.println("e = " + e);
            return true;
        });

        // 최종 연산이 없으면 위에 stream2는 실행 안됨
        long count = stream2.count();

        // 중간 Stream 변수 없이 사용
        long count1 = list.stream().filter(e -> {
            System.out.println("### count1");
            System.out.println("e = " + e);
            return true;
        }).count();

        // 최종연산이 종료된 Stream 은 재사용 불가
//        stream1.count();
        list.stream().count();
        System.out.println("프로그램 종료");
    }
}
