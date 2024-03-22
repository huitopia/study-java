package ch17.sec00;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors03 {
    public static void main(String[] args) {
        List<String> list
                = List.of("java", "css", "html", "spring", "jquery", "c++", "home", "swift", "javascript");
        // 결과 타입 Map<String, List<String>>
        // key: "j", "c", "h", "s"
        // val: "java", "javascript" ...
        Map<String, List<String>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(
                        e -> e.substring(0, 1)
                ));
        System.out.println("groupingMap = " + groupingMap);


    }
}
