package ch11.sec00.p2throw;

public class C03Throw {
    public static void main(String[] args) {
        try {
            someMethod01();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod01() throws Exception {
        // 예외처리 작성 안 하는 unchecked exception ➡️ 오류 없음
//        throw new RuntimeException();
        // checked exception이라 오류 ➡️ 예외처리 작성해야함
        // ➡️methodName throws Exception { ... }
        // throws : 메소드 선언부에 발생하는 예외 작성
        throw new Exception();

    }
}
