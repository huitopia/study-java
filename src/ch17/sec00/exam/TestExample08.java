package ch17.sec00.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestExample08 {
    public static void main(String[] args) {
        List<Member08> list = Arrays.asList(
                new Member08("홍", "개발자"),
                new Member08("신", "디자이너"),
                new Member08("김", "개발자")
        );
        Map<String, List<Member08>> groupingMap
                = list.stream()
                .collect(Collectors.groupingBy(
                        Member08::getJob
                ));
        System.out.println("[개발자]");
        groupingMap.get("개발자").forEach(System.out::println);
        System.out.println();
        System.out.println("[디자이너]");
        groupingMap.get("디자이너").forEach(System.out::println);
    }
}

class Member08 {
    private String name;
    private String job;

    public Member08(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", job: " + job + "}";
    }
}
