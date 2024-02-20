package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x : " + x); // 100

        byte b = 100;
        // 부호를 변경하는 것도 연산으로 error
        // byte y = -b;
        int y = -b;
        System.out.println("y : " + y);
    }
}
