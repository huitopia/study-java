package ch15.sec00;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set06 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 추가
        set.add("java");
        set.add("html");
        set.add("react");
        set.add("node");
        // 순서대로 저장 안됨
        System.out.println("set = " + set); // [node, java, html, react]
        System.out.println("set.size() = " + set.size()); // 4
        set.add("react");
        // 중복 저장 안 돼서 변경 없음
        System.out.println("set.size() = " + set.size());

        // 검색 contains
        boolean result1 = set.contains("css");
        boolean result2 = set.contains("java");
        System.out.println("result1 = " + result1); // false
        System.out.println("result2 = " + result2); // true

        // 삭제 remove
        System.out.println("set remove test = " + set); // [node, java, html, react]
        boolean result3 = set.remove("css");
        boolean result4 = set.remove("react");
        System.out.println("result3 = " + result3); // false
        System.out.println("result4 = " + result4); // true
        System.out.println("set remove result = " + set); // [node, java, html]

        // 전체 탐색
        System.out.println("### 향상된 for 문으로 가능하다");
        for (String item : set) {
            System.out.println(item);
        }

        // 전체 탐색 : Lambda
        System.out.println("### forEach");
        set.forEach(System.out::println);

        // Iterator 사용
        // hashNext : 탐색할 아이템이 있는지?
        // next : 다음 아이렘 리턴
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // 다음에 탐색할게 있으면
            String next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
