package ch11.sec00.p1exception;

import java.util.List;

public class C07Finally {
    public static void main(String[] args) {
        /* finally : 항상 실행되는 블럭 */
        List<String> list = List.of("a", "b");
        try {
            System.out.println("실행 시작");
            for (int i = 0; i <= list.size(); i++) {
                System.out.println("list = " + list.get(i));
            }
            System.out.println("실행 완료");
        } catch (Exception e) {
            System.err.println("### Exception 발생 ###");
            System.err.println(e.getMessage());
        } finally {
            System.out.println("항상 실행되는 블럭");
        }
    }
}
