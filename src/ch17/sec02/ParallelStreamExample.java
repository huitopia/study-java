package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("이름1");
        list.add("이름2");
        list.add("이름3");
        list.add("이름4");
        list.add("이름5");

        Stream<String> parallelStream = list.parallelStream(); // 병렬 스트림 얻기
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName()); // 람다식
        });
    }
}
