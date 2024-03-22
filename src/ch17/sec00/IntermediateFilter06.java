package ch17.sec00;

import java.util.List;

public class IntermediateFilter06 {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "react", "spring", "html");
        System.out.println("### 길이 짝수 출력");
        list.stream().filter(e -> e.length() % 2 == 0).forEach(System.out::println);
        System.out.println();
        System.out.println("### 길이 홀수 출력");
        list.stream().filter(e -> e.length() % 2 == 1).forEach(System.out::println);
    }
}
