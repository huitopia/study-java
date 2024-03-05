package ch06.sec16.test20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("-----------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 > ");

            int menuNo = scanner.nextInt();
            switch (menuNo) {
                case 1 -> {
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호 > ");
                    String accountNum = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("계1좌주 > ");
                    String accountName = scanner.nextLine();

                    System.out.print("초기입금금액 > ");
                    int balance = Integer.parseInt(scanner.nextLine());


                    Account newAccount = new Account(accountNum, accountName, balance);
                    for (int i = 0; i < accountArray.length; i++) {
                        if (accountArray[i] == null) {
                            accountArray[i] = newAccount;
                            System.out.println("계좌 생성 완료");
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    for (int i = 0; i < accountArray.length; i++) {
                        Account account = accountArray[i];
                        if (account != null) {
                            System.out.println(account.getAccountNum());
                            System.out.println(account.getAccountName());
                            System.out.println(account.getBalance());
                        }
                    }
                }
                default -> run = false;
            }
        }
    }
}
