package ch17.sec00;

import java.util.List;

public class IntermediateSorted09 {
    // Sorted : 정렬된 stream 리턴
    public static void main(String[] args) {
        List<Integer> list = List.of(9, 3, 10, 6, 5, 7, 1, 6, 7);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("#####");
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        List<String> list1 = List.of("java", "css", "react", "html", "node", "vue");
        list1.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("### map");
        list1.stream()
                .sorted()
                .map(e -> e.length())
                .forEach(System.out::println); // 3 4 4 4 5 3
        System.out.println("### map 2");
        list1.stream()
                .map(e -> e.length())
                .sorted()
                .forEach(System.out::println); // 3 3 4 4 4 5

    }
}
