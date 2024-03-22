package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new ch17.sec12.exam01.Student("홍", "남", 92));
        totalList.add(new ch17.sec12.exam01.Student("김", "여", 87));
        totalList.add(new ch17.sec12.exam01.Student("감", "남", 95));
        totalList.add(new ch17.sec12.exam01.Student("오", "여", 93));

        Map<String, Double> map = totalList.stream()
                .collect(
                        // 그룹핑 후 매핑 및 집계를 수행할 수 있도록 두번째 Collector를 가질 수 있다.
                        Collectors.groupingBy(
                                a -> a.getSex(),
                                Collectors.averagingDouble(a -> a.getScore())
                        )
                );

        System.out.println("map = " + map);
    }
}
