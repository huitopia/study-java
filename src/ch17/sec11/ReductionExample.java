package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍", 92),
                new Student("신", 95),
                new Student("김", 88)
        );
        // sum
        int sum = list.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("sum = " + sum);
        // reduce
        int reduce = list.stream()
                .map(Student::getScore)
                .reduce(0, (x, y) -> x + y);
        System.out.println("reduce = " + reduce);
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}