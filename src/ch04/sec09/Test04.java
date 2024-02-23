package ch04.sec09;

import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int num1 = random.nextInt(1, 7);
            int num2 = random.nextInt(1, 7);
            if (num1 + num2 == 5) {
                break;
            }
        }
    }
}
