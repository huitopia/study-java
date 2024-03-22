package ch17.sec00.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestExample07 {
    public static void main(String[] args) {
        List<Member01> list = Arrays.asList(
                new Member01("홍", "개발자"),
                new Member01("김", "디자이너"),
                new Member01("신", "개발자")
        );
        // 1
        List<Member01> developers = list.stream()
                .filter(n -> n.getJob().contains("개발자"))
                .toList();
        // 2
        List<Member01> developers1 = list.stream()
                .filter(n -> n.getJob().equals("개발자"))
                .collect(
                        () -> new ArrayList<>(),
                        (c, e) -> c.add(e),
                        (a, b) -> {
                        }
                );
        developers.stream().forEach(n -> System.out.println(n.getName()));
        developers1.stream().forEach(n -> System.out.println(n.getName()));
    }
}

class Member01 {
    private String name;
    private String job;

    public Member01(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
