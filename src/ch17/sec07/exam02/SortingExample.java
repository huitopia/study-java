package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍홍홍", 30));
        list.add(new Student("신신신", 10));
        list.add(new Student("미미민", 20));
        System.out.println("### 점수 기준으로 오름차순 정렬");
        list.stream()
                // s2.getScore 기준으로 올림차순 정렬
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println("### 점수를 기준으로 내림차순 정렬");
        list.stream()
                // s1, s2 순서를 바꿔 내림차순 정렬
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

    }
}
