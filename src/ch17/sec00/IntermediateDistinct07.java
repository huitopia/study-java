package ch17.sec00;

import java.util.List;

public class IntermediateDistinct07 {
    public static void main(String[] args) {
        System.out.println("### distinct 중복 제거");
        List<Integer> list = List.of(6, 2, 3, 6, 0, 3, 0, 1);
        long count1 = list.stream().distinct().count();
        System.out.println("count1 = " + count1);
        list.stream().distinct().forEach(System.out::println);

        // 중간 연산들 조합
        System.out.println("### 중간 연산 조합");
        List<Integer> list1 = List.of(9, 5, 0, 10, 7, 6, 9, 0, 1, 1);
        list1.stream().distinct().filter(e -> e % 2 == 1).forEach(System.out::println);

    }
}
