package ch04.sec09;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        boolean run = true;
        int inputCost = 0;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("------------------------------");
            System.out.println(" 1: 예금 | 2: 출금 | 3: 잔고 | 4: 종료 ");
            System.out.print("선택> ");
            int inputMenu = scanner.nextInt();
            switch (inputMenu) {
                case 1 -> {
                    System.out.print("예금액> ");
                    inputCost += scanner.nextInt();
                    break;
                }
                case 2 -> {
                    System.out.println("출금액> ");
                    inputCost -= scanner.nextInt();
                    break;
                }
                case 3 -> {
                    System.out.println("잔고> " + inputCost);
                    break;
                }
                default -> run = false;
            }
        }
        System.out.println("종료");
    }
}
