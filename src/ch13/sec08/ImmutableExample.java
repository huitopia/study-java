package ch13.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        // List 불변 컬렉션 생성
        List<String> immutable1 = List.of("A", "B", "C");
//        immutable1.add("D"); (X)
        // Set 불변 컬렉션 생성
        System.out.println("immutable1 = " + immutable1);
        Set<String> immutable2 = Set.of("A", "B", "C");
//        immutable2.add("D"); (X)
        System.out.println("immutable2 = " + immutable2);
        // Map 불변 컬렉션 생성
        Map<Integer, String> immutable3 = Map.of(1, "A",
                2, "B",
                3, "C");
//        immutable3.put(4, "D"); (X)
        System.out.println("immutable3 = " + immutable3);

        // List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("list = " + list);
        List<String> immutableList = List.copyOf(list);
        immutableList.add("D");
        System.out.println("immutableList = " + immutableList);
        // Set 컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);
        Set<String> immutableSet = Set.copyOf(set);
        System.out.println("immutableSet = " + immutableSet);
        // Map 컬렉션을 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println("map = " + map);
        Map<Integer, String> immutableMap = Map.copyOf(map);
        System.out.println("immutableMap = " + immutableMap);
        // 배열로부터 List 불변 컬렉션 생성
        String[] arr = {"A", "B", "C"};
        System.out.println("arr = " + Arrays.toString(arr));
        List<String> stringList = Arrays.asList(arr);
        System.out.println("stringList = " + stringList);

    }
}
