package ch11.sec00.p1exception;

import java.util.List;

public class C02CheckedException {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        // List.get : IndexOutOfBoundsException
        // (unchecked exception, 컴파일러 검사 X) ➡️ 예외 처리 코드 필수는 아님
        System.out.println("list.get(2) = " + list.get(2));
        // Class.forName : ClassNotFoundException
        // (checked exception, 컴파일러가 검사 ➡️ 예외 처리 코드 필수
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
