package ch15.sec00;

import java.util.ArrayList;
import java.util.List;

public class Of05 {
    public static void main(String[] args) {
        // List.of 로 리스트 객체 생성
        List<String> list1 = List.of();
        System.out.println("list1.size() = " + list1.size());

        List<String> list2 = List.of("java");
        System.out.println("list2.size() = " + list2.size());
        System.out.println("list2 = " + list2);

        List<String> list3 = List.of("react", "vue", "jsp");
        System.out.println("list3 = " + list3);
        // of method 로 만든 객체는 수정이 불가능하다(추가, 삭제, 수정 안됨)
        /* list3.add("hello"); // exception error
        System.out.println("list3 = " + list3);*/

        List<String> list4 = new ArrayList<>();
        list4.add("spring");
        list4.add("css");
        System.out.println("list4 = " + list4);
        // of method 사용 객체와 new ArrayList 로 생성한 객체의 차이

        // 중첩된 List
        List<List<Integer>> list5 = List.of(
                List.of(95, 96),
                List.of(83, 92, 96),
                List.of(78, 83, 93, 87, 88)
        );

        System.out.println("list5.get(1).get(1) = " + list5.get(0).get(1));
        System.out.println("list5.get(2).get(2) = " + list5.get(2).get(2));

    }
}
