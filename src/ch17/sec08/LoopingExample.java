package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        // 잘못된 코드 : 최종 처리가 없으므로 동작하지 않음
        Arrays.stream(intArray)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println);
        // 중간 처리 메소드 peek()을 이용해서 반복 처리
        int total = Arrays.stream(intArray)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("total = " + total);
        System.out.println();
        // 최종 처리 메소드 forEach() 활용 반복 처리
        Arrays.stream(intArray)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);

    }
}
