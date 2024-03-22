package ch17.sec00;

import java.util.List;

public class IntermediateFilter05 {
    public static void main(String[] args) {
        List<Integer> list = List.of(9, 6, 3, 0, 12, 15, 18, 21, 23);
        // filter : 특정 요소만 filtering
        long count1 = list.stream().filter(e -> e % 2 == 0).count();
        System.out.println("count1 = " + count1);
        long count2 = list.stream().filter(e -> e % 2 == 1).count();
        System.out.println("count2 = " + count2);
    }
}
