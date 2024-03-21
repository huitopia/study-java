package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("이름1");
        set.add("이름2");
        set.add("이름3");
        System.out.println("set = " + set);

        // Stream 이용한 요소 반복 처리
        Stream<String> stream = set.stream(); // 스트림 얻기
        stream.forEach(name -> System.out.println("name = " + name)); // 람다식
    }
}
