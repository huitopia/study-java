package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member> set = new HashSet<>();
        // Member 에 객체 저장
        /* 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장 (equals, hashSet method 재정의함)*/
        set.add(new Member("성이름", 30));
        set.add(new Member("성이름", 30));
        // 저장된 객체 수 출력
        System.out.println("set.size() = " + set.size()); // 1
    }
}
