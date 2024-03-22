package ch17.sec00;

import java.util.List;
import java.util.stream.Collectors;

public class Collectors01 {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "html");
        String collect1 = list.stream()
                .collect(Collectors.joining());
        System.out.println("collect1 = " + collect1);

        String collect2 = list.stream()
                .collect(Collectors.joining("-"));
        System.out.println("collect2 = " + collect2);


    }
}
