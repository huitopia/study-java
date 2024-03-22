package ch17.sec00;

import java.util.List;

public class Reduce01 {
    public static void main(String[] args) {
        // reduce : reduction 최종 연산
        List<String> list = List.of("java", "css", "spring", "html");
        // javacssspringhtml
        System.out.println("### for 문 활용");
        String reuslt1 = "";
        for (String s : list) {
            reuslt1 += s;
        }
        System.out.println("reuslt1 = " + reuslt1);

        List<Integer> list1 = List.of(3, 6, 8, 10);
        int sum1 = 0;
        for (Integer i : list1) {
            sum1 += i;
        }
        System.out.println("sum1 = " + sum1);

        System.out.println("### stream 활용");
        String result2 = list.stream()
                // reduct(초기값, (직전, 현재))
                .reduce("", (a, e) -> a + e);
        System.out.println("result = " + result2);
        Integer result3 = list1.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("result3 = " + result3);

    }
}
