package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        // asDoubleStream : int -> double / long -> double 변환
        intStream.asDoubleStream()
                .forEach(System.out::println);
        System.out.println();

        intStream = Arrays.stream(intArray);
        // 기본 타입 스트림을 래퍼 스트림으로 변환
        // boxed : int -> Integer / long -> Long / double -> Double
        intStream.boxed()
                .forEach(System.out::println);
    }
}
