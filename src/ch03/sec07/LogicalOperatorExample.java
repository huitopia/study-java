package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자");
        }
        if ((97 <= charCode) & (charCode <= 122)) {
            System.out.println("소문자");
        }
        if ((48 <= charCode) & (charCode <= 57)) {
            System.out.println("0~9 숫자");
        }

        int val = 6;

        if ((val % 2 == 0) | (val % 3 == 0)) {
            System.out.println("2또는 3의 배수");
        }

        boolean result = (val % 2 == 0) || (val % 3 == 0);
        System.out.println("result : " + result);
        if (!result) {
            System.out.println("2또는 3의 배수가 아니다");
        }
    }
}
