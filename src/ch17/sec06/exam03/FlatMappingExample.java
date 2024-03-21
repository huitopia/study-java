package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am best developer");
        list1.stream()
                // flatMap : T -> Stream<R> 변환
                .flatMap(d -> Arrays.stream(d.split(" ")))
                .forEach(System.out::println);
        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                //  flatMapToInt : T -> IntStream 변환
                .flatMapToInt(d -> {
                            String[] strArr = d.split(",");
                            System.out.println("strArr = " + Arrays.toString(strArr));
                            System.out.println("strArr.length = " + strArr.length);
                            // strArr의 길이만큼 intArr의 인덱스 생성
                            int[] intArr = new int[strArr.length];
                            System.out.println("intArr = " + Arrays.toString(intArr));
                            for (int i = 0; i < strArr.length; i++) {
                                intArr[i] = Integer.parseInt(strArr[i].trim());
                            }
                            return Arrays.stream(intArr);
                        }
                )
                .forEach(System.out::println);
    }
}
