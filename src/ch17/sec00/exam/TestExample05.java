package ch17.sec00.exam;

import java.util.Arrays;
import java.util.List;

public class TestExample05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("This is a java book", "Lambda Expreesions", "Java8 supports lambda expressions");
        // 1
        list.stream().filter(e -> e.toLowerCase().contains("java")).forEach(System.out::println);
        // 2
        list.stream().filter(e -> e.matches(".*[jJ][aA][vV][aA].*")).forEach(System.out::println);
    }
}
