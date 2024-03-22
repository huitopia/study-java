package ch17.sec00;

import java.util.List;
import java.util.Optional;

public class Reduce02 {
    public static void main(String[] args) {
        List<String> list1 = List.of("j", "a", "v", "a");
        String result1 = list1.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("result1 = " + result1);

        Optional<String> result2 = list1.stream()
                .reduce((a, b) -> a + b);
        String s = result2.get();
        System.out.println("s = " + s);

        List<String> list2 = List.of();
        String result3 = list2.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("result3 = " + result3);
        Optional<String> result4 = list2.stream().reduce((a, b) -> a + b);
        if (result4.isPresent()) {
            System.out.println("result4 = " + result4); // 실행 안됨
        }


    }
}
