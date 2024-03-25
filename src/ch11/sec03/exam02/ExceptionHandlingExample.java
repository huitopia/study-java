package ch11.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};
        for (int i = 0; i <= arr.length; i++) {
            try {
                int val = Integer.parseInt(arr[i]);
                System.out.println("arr[" + i + "]: " + val);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과: " + e.getMessage());
            } catch (Exception e) { // 상위 예외 클래스는 아래에 작성
                System.out.println("실행 문제: " + e.getMessage());
            }
        }
    }
}
