package ch15.sec00;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        // -- List 특징
        // 데이터의 순서(index)가 있으며 중복이 허용된다.

        List<String> list1 = new ArrayList<>(); // 빈 리스트 생성
        // element(요소, 원소, 아이텡) 추가
        list1.add("java");
        list1.add("spring");
        list1.add("react");
        list1.add("css");
        list1.add("spring");
        System.out.println("list1 = " + list1);

        // element 읽기(얻기 get)
        String str1 = list1.get(2);
        String str2 = list1.get(4);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // 검색(contains)
        System.out.println("list1.contains(\"spring\") = " + list1.contains("spring"));
        System.out.println("list1.contains(\"html\") = " + list1.contains("html"));

        // 삭제(remove)
        // 지우면 true, 못 지우면 false
        list1.remove("java");
        list1.remove("html");
        list1.remove("spring");
        System.out.println("list1 = " + list1);

        // 전체 탐색
        // for
        System.out.println("For");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("list1.get(i) = " + list1.get(i));
        }
        // 향상된 for
        System.out.println("향상된 For");
        for (String item : list1) {
            System.out.println("item = " + item);
        }
        // forEach & lambda
        System.out.println("forEach &' lambda");
        list1.forEach(System.out::println);

    }
}
