package ch17.sec00;

import java.util.List;

public class IntermediateMap08 {
    /* map
     * 각 요소를 다른 요소로 변환하는 중간 연산
     */
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "html", "hello world");

        list.stream()
                .map(e -> e.substring(0, 1))
                .forEach(System.out::println);


        list.stream()
                .map(e -> e.length())
                .forEach(System.out::println);
    }
}
