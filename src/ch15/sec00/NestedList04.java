package ch15.sec00;

import java.util.ArrayList;
import java.util.List;

public class NestedList04 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println("array[1][1] = " + array[1][1]); // 92

        List<List<Integer>> list01 = new ArrayList<>();
        // List 내부의 List가 3개이기 때문에 내부 List 3번 추가
        list01.add(new ArrayList<>());
        list01.add(new ArrayList<>());
        list01.add(new ArrayList<>());

        /* 1번 */
/*        list01.get(0).add(95);
        list01.get(0).add(86);
        list01.get(1).add(83);
        list01.get(1).add(92);
        list01.get(1).add(96);
        list01.get(2).add(78);
        list01.get(2).add(83);
        list01.get(2).add(93);
        list01.get(2).add(87);
        list01.get(2).add(88);*/

        /* 2번 */
        List<Integer> subList01 = list01.get(0);
        subList01.add(95);
        subList01.add(86);
        List<Integer> subList02 = list01.get(1);
        subList02.add(83);
        subList02.add(92);
        subList02.add(96);
        List<Integer> subList03 = list01.get(2);
        subList03.add(78);
        subList03.add(83);
        subList03.add(93);
        subList03.add(87);
        subList03.add(88);

        System.out.println("list01.get(0).get(1) = " + list01.get(0).get(1));
    }
}
