package ch11.sec00.p1exception;

import java.util.List;

public class C04TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        try {
            System.out.println("list.get(0) = " + list.get(0));
            System.out.println("list.get(1) = " + list.get(1));
            System.out.println("list.get(2) = " + list.get(2));
            System.out.println("모든 원소 출력됨");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception 발생");
        }
        System.out.println("프로그램 종료");
    }
}
