package ch11.sec00.p1exception;

import java.util.List;

public class C06Finally {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        try {
            for (int i = 0; i <= list.size(); i++) {
                System.out.println("list.get(i) = " + list.get(i));
            }
            System.out.println("출력 완료");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Exception 발생");
        } finally { // exception 발생 여부와 상관 없이 실행되는 코드 블럭
            System.out.println("프로그램 종료");
        }
    }
}
