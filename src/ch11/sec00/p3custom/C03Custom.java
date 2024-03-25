package ch11.sec00.p3custom;

public class C03Custom {
    public static void main(String[] args) {
        try {
            method01();
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
        }
    }

    public static void method01() {
        throw new BreakDoorHandleException("exception 상속");
    }

}

/*
 * 직접 만드는 exception
 * 1. Exception : checkedException
 * 2. RuntimeException : uncheckedException (선호)
 */

class BreakDoorHandleException extends RuntimeException {
    BreakDoorHandleException(String message) {
        // 파라미터 값이 있으면 super 구현
        super(message);
    }
}

