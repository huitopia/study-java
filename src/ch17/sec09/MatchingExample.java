package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};
        boolean result = Arrays.stream(intArr)
                // 모든 요소가 만족하는지 여부
                .allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수다? " + result);

        result = Arrays.stream(intArr)
                // 최소한 하나의 요소가 만족하는지
                .anyMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 존재한다? " + result);

        result = Arrays.stream(intArr)
                // 모든 요소가 만족하지 않는지
                .noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없다? " + result);
    }
}
