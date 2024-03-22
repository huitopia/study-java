package ch17.sec00;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors02 {
    public static void main(String[] args) {
        List<String> list = List.of("손흥민-토트넘", "이강인-파리", "오타니-LA");
        Map<String, String> result1 = list.stream()
                .collect(Collectors.toMap(e -> e.split("-")[0], e -> e.split("-")[1])
                );
        System.out.println("result1 = " + result1);

    }
}
