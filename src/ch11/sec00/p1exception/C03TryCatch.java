package ch11.sec00.p1exception;

import java.util.List;

public class C03TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        String s1 = list.get(0);
        try { // try : exception 발생할 수 있는 코드를 감싼 블럭
            System.out.println("### Exception 발생 전 실행 코드");
            String s2 = list.get(2); // exception 발생
            System.out.println("### Exception 발생 안함");
        } catch (IndexOutOfBoundsException e) { // catch : 발생한 exception 처리 코드 블럭
            System.out.println("### Exception 발생");
        }
        System.out.println("### 나머지 코드");
    }
}
