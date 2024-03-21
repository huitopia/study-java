package ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("이름1", 20),
                new Student("이름2", 25),
                new Student("이름3", 27)
        );

        double avg = studentList.stream()
                // Stream 을 IntStream 으로 변환
                .mapToInt(student -> student.getScore())
                // Stream 요소들의 평균 값을 계산하는 최종 연산
                .average()
                // 값이 있으면 해당 OptionalDouble값을 반환 없으면 NoSuchElementException 발생
                .getAsDouble();
        System.out.println("avg = " + avg);

    }
}
