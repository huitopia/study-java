package ch17.sec00;

import java.util.List;
import java.util.stream.Collectors;

public class Collectors04 {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "son", "lee", "otani");
        Long collect = list.stream()
                .collect(Collectors.counting());
        System.out.println("collect = " + collect);
    }
}
