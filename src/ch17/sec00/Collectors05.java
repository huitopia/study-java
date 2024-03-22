package ch17.sec00;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors05 {
    public static void main(String[] args) {
        List<String> list = List
                .of("java", "css", "html",
                        "spring", "jquery", "c++",
                        "home", "swift", "javascript");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(
                                s -> s.substring(0, 1),
                                Collectors.counting()
                        )
                );
        System.out.println("collect = " + collect);
    }
}
