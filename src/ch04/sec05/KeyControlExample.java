package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        //  Scanner 생성
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
            System.out.println("선택 : ");

            //  키보드에 입력한 내용 읽음
            String strNum = scanner.nextLine();

            //  if
//            if (strNum.equals("1")) {
//                speed++;
//                System.out.println("현재 속도 = " + speed);
//            } else if (strNum.equals("2")) {
//                speed--;
//                System.out.println("현재 속도 = " + speed);
//            } else if (strNum.equals("3")) {
//                run = false;
//            }

            //  switch Expressions
            switch (strNum) {
                case "1" -> speed++;
                case "2" -> speed--;
                default -> run = false;
            }
            System.out.println("현재 속도 = " + speed);
        }
        System.out.println("프로그램 종료");
    }
}
