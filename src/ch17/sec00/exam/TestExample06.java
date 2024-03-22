package ch17.sec00.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExample06 {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("홍홍홍", 30),
                new Member("신신신", 40),
                new Member("김김김", 26)
        );
        double avg = memberList.stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.println("평균 나이: " + avg);


    }

}

class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
