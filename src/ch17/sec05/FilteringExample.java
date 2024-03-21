package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("이름1");
        list.add("기름2");
        list.add("이름1");
        list.add("이름3");
        list.add("시름4");
        // 중복 요소 제거
        list.stream().distinct().forEach(System.out::println);
        System.out.println();
        // 이로 시작하는 요소만 필터링
        // startsWith() : 주어진 문자열로 시작하면 true, 아니면 false
        list.stream().filter(n -> n.startsWith("이"))
                .forEach(System.out::println);
        System.out.println();
        // 중복 요소 제거 후 이로 시작하는 요소만 필터링
        list.stream().distinct()
                .filter(n -> n.startsWith("이"))
                .forEach(System.out::println);

    }
}
