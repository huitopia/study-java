package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지 입력");
        System.out.println("q: 프로그램 종료");

        Scanner scanner = new Scanner(System.in); //    Scanner 생성
        String inputString;

        do {
            System.out.println(">");
            inputString = scanner.nextLine(); //    키보드 읽기
            System.out.println("inputString = " + inputString);
        } while (!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
