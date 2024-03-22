package ch17.sec00;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateLimit10 {
    // Limit : 주어진 수 만큼의 요소의 스트림을 리턴
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 2, 5, 1, 10, 9, 2, 1, 0);

        list.stream()
                .limit(5) // 앞에서 5개
                .forEach(System.out::println);
        System.out.println("IntermediateLimit10.main");
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("IntermediateLimit10.main");
        list.stream()
                .sorted()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("IntermediateLimit10.main");
        list.stream()
                .sorted((a, b) -> b - a) // 역순
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // skip : 정해진 갯수만큼의 요소 건너뛰기
        System.out.println("list = " + list);
        list.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("list중 2번째로 작은 값 = " + list);
        list.stream()
                .sorted()
                .distinct()
                .limit(2)
                .skip(1)
                .forEach(System.out::println);
        System.out.println("list 중 3번째로 큰 값 = " + list);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .skip(2)
                .forEach(System.out::println);
    }
}
