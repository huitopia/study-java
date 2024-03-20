package ch15.sec00;


import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수

        List<Integer> scores = new LinkedList<>();
        map.forEach((k, v) -> {
            scores.add(v);
        });

        Collections.sort(scores);
        maxScore = scores.getLast();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if (map.get(key) == maxScore) {
                name = key;
            }
            totalScore += map.get(key);
        }

        System.out.println("name = " + name);
        System.out.println("maxScore = " + maxScore);
        System.out.println("totalScore = " + totalScore);
    }
}
