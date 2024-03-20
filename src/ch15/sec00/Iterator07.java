package ch15.sec00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("javascript");
        list.add("node");
        list.add("react");

        // 고전적 for, 향상된 for, forEach
        System.out.println("### for ###");
        for (int i = 0; i < list.size(); i++) {
//            System.out.println("list.get(i) = " + list.get(i));
            String s = list.get(i);
            if (s.length() % 2 == 1) {
                System.out.println("list remove item= " + list.get(i));
                list.remove(i);
            }
        }
        System.out.println("list = " + list);
        System.out.println("### 향상된 for ###");
        System.out.println("### forEach ###");
        // Iterator
        System.out.println("### iterator ###");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println("iterator = " + list);
    }
}
