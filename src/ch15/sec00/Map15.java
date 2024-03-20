package ch15.sec00;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map15 {
    public static void main(String[] args) {
        // map : entry (key,value) 를 저장
        // 같은 key를 가진 두 개의 entry를 저장할 수 없음
        Map<String, String> map = new HashMap<>();
        // entry 추가
        map.put("java", "programming");
        map.put("CSS", "Style sheet");
        map.put("html", "html desc");
        map.put("spring", "html desc");
        // key 중복 저장 불가능
//        map.put("spring", "html desc");
        map.put("react", "fronted");
        // entry 검색
        boolean b1 = map.containsKey("java");
        boolean b2 = map.containsKey("css");
        boolean b3 = map.containsKey("jsp");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        // entry.value
        String val1 = map.get("java");
        String val2 = map.get("react");
        System.out.println("val1 = " + val1);
        System.out.println("val2 = " + val2);
        // entry 삭제
        map.remove("CSS");
        // entry 수정
        map.put("java", "프로그래밍 언어");
        String val4 = map.get("java");
        System.out.println("val4 = " + val4);
        // map 크기
        System.out.println("map.size() = " + map.size());
        // 전체탐색
        // 1. keySet
        Set<String> keySet = map.keySet();
        // forEach
        // enhanced for
        for (String key : keySet) {
            System.out.println(key + ": " + map.get(key));
        }
        // 2. entrySet
        System.out.println("### entrySet && 향상된 for 사용");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // forEach
        // enhanced for
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // 3. forEach
        System.out.println("### forEach 메소드 활용");
        map.forEach((k, v) -> System.out.println(k + " :" + v));
    }
}
