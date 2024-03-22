package ch17.sec00;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect01 {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html", "react");
        List<Integer> result1 = new ArrayList<>();
        for (String s : list) {
            result1.add(s.length());
        }
        System.out.println("result1 = " + result1); // [4, 6, 3, 4, 5]
        List<Integer> result2 = list.stream()
                .collect(
                        () -> new ArrayList<Integer>(),
                        (c, e) -> c.add(e.length()),
                        (a, b) -> {
                        }
                );
        System.out.println("result2 = " + result2);

        List<Integer> result3 = list.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());
        System.out.println("result3 = " + result3);
    }
}
