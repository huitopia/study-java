package ch15.sec00;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet09 {
    public static void main(String[] args) {
        /* TreeSet
         * Comparator 또는 Comparable(natural ordering)을 사용해 원소(element)의 순서가 결정됨
         * */

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(2);
        set.add(50);
        set.add(100);
        set.add(70);
        System.out.println("set = " + set); // [2, 10, 50, 70, 100]
    }
}
