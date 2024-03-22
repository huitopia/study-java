package ch17.sec00;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primitive01IntStream {
    /* 기본 타입 원소를 처리하는 Stream
    IntStream, LongStream, DoubleStream
    최종연산 : sum, min, max, average, toArray
    중간연산 : boxed
     */
    public static void main(String[] args) {
        // IntStream
        int[] arr = {9, 3, 10, 1, 0, 2, 3, 9, 1, 5, 5};
        IntStream stream1 = Arrays.stream(arr);
        IntStream stream2 = IntStream.of(arr);

        List<Integer> list = List.of(10, 3, 9, 5, 7, 6);
        list.stream() // 참조타입을 원소로 하는 Stream<Integer>
                .mapToInt(Integer::intValue);

        // sum
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);
        // min
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("min = " + min);
        // max
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("max = " + max);
        // average
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println("average = " + average);
        // toArray
        int[] array = Arrays.stream(arr).toArray();
        System.out.println("array = " + Arrays.toString(array));
        // boxed : IntStream -> Stream<Integer>
        Stream<Integer> integerStream = Arrays.stream(arr).boxed();
        long count = integerStream.count();
        System.out.println("count = " + count);


    }
}
