package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"가나다", "나나다", "라라다"};
        Stream<String> stringStream = Arrays.stream(strArray);
        stringStream.forEach(a -> System.out.printf(a + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.printf(a + ","));
        System.out.println();
    }
}
