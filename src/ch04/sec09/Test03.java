package ch04.sec09;

public class Test03 {
    public static void main(String[] args) {
        //  3의 배수 총 합 출력
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
