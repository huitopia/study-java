package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for (int i = 0; i <= array.length; i++) {
            try {
                System.out.println("i : " + i);
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("배열 인덱스 초과: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("숫자로 변환 불가: " + e.getMessage());
            }
        }
    }
}
