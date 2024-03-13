package ch16.sec00;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        String[] names = {"son", "parking", "hwang"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names); // 정렬
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> b.length() - a.length()); // 길이가 더 긴 거
        System.out.println(Arrays.toString(names));
    }
}
