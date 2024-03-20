package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장
        map.put("이름1", 85);
        map.put("이름2", 90);
        map.put("이름3", 80);
        map.put("이름1", 95); // 중복 키라 제일 마지막에 저장한 값만 저장
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
        // 키로 값 얻기
        String key = "이름1";
        int value = map.get(key); // 키를 매개값으로 주면 값을 리턴
        System.out.println(key + ": " + value);
        System.out.println();
        // 키 Set 컬렉션 얻고, 반복해서 키와 값을 얻기
        // 키를 반복하기 위해 반복자를 얻음
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();
        // 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();
        // 키로 엔트리 삭제
        map.remove("이름1");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}
