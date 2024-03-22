package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍", "남", 92));
        studentList.add(new Student("김", "여", 87));
        studentList.add(new Student("감", "남", 95));
        studentList.add(new Student("오", "여", 93));

        List<Student> maleList = studentList.stream()
                .filter(n -> n.getSex().equals("남"))
                .toList();
        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();
        Map<String, Integer> map = studentList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println("map = " + map);
    }
}

