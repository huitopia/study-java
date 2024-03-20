package ch15.sec00;

import java.util.ArrayList;
import java.util.List;

public class NestedList03 {
    public static void main(String[] args) {
        // 원소가 String
        List<String> list1 = new ArrayList<String>();
        list1.add("java");
        list1.add("spring");

        // 원소가 List
        List<List<String>> list2 = new ArrayList<List<String>>();
        list2.add(new ArrayList<>());
        list2.add(new ArrayList<>());

        List<String> subList1 = list2.get(0);
        subList1.add("react");
        subList1.add("vue");

        list2.get(1).add("javascript");
        list2.get(1).add("node");

        System.out.println("list1 = " + list1); // [java, spring]
        System.out.println("list2 = " + list2); // [[react, vue], [javascript, node]]
        System.out.println("subList1 = " + subList1); // [react, vue]
        System.out.println("list2.get(0).get(1) = " + list2.get(0).get(1)); // vue
        System.out.println("list2.get(1).get(0) = " + list2.get(1).get(0)); // javascript

    }
}
