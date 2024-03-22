package ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("### 2의 배수");
        // 카운팅
        long count = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .count();
        System.out.println("count = " + count);
        // 총합
        int sum = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .sum();
        System.out.println("sum = " + sum);
        // 평균
        double average = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("average = " + average);
        // 최대값
        int max = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("max = " + max);
        // 최소값
        int min = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("min = " + min);
        System.out.println("### 첫 번째 3의 배수");
        int first = Arrays.stream(arr)
                .filter(a -> a % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("first = " + first);
    }
}
