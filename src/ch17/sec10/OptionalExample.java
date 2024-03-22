package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble optional1 = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional1.isPresent()) {
            System.out.println("1 average : " + optional1.getAsDouble());
        } else {
            System.out.println("1 average : 0.0");
        }

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("2 average : " + avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("3 average : " + a));
    }
}
