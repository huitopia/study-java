package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo", null, "200"};
        for (int i = 0; i <= arr.length; i++) {
            try {
                int val = Integer.parseInt(arr[i]);
                System.out.println("arr[" + i + "]: " + val);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과: " + e.getMessage());
            } catch (NumberFormatException | NullPointerException e) {
                // 2가지 예외 동일 처리
                System.out.println("데이터 문제: " + e.getMessage());
            }
        }
    }
}
