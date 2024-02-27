package ch05.sec13;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        // Scanner 입력
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int[] scoreArray = new int[0];
        int student = 0;
        int maxScore = 0;
        int totalSum = 0;
        double totalAvg = 0.0;

        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.println("선택 > ");
            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1 -> {
                    System.out.println("학생 수 > ");
                    //  학생 수 입력 받음
                    student += scanner.nextInt();
                    //  학생 수만큼 배열 인덱스 생성
                    scoreArray = new int[student];
                    break;
                }
                case 2 -> {
                    for (int i = 0; i < student; i++) {
                        System.out.println("scores[" + i + "] > ");
                        //  점수 받기
                        scoreArray[i] += scanner.nextInt();
                    }
                    break;
                }
                case 3 -> {
                    for (int i = 0; i < student; i++) {
                        System.out.println("scores[" + i + "] : " + scoreArray[i]);
                    }
                    break;
                }
                case 4 -> {
                    for (int i = 0; i < scoreArray.length; i++) {
                        //  점수 총 합계
                        totalSum += scoreArray[i];
                        //  최고 점수 찾기
                        if (maxScore < scoreArray[i]) {
                            maxScore = scoreArray[i];
                        }
                    }
                    //  평균 점수 찾기
                    totalAvg = (double) totalSum / student;
                    System.out.println("최고 점수 : " + maxScore);
                    System.out.println("평균 점수 : " + totalAvg);
                    break;
                }
                default -> run = false;
            }
            System.out.println("프로그램 종료");
        }


    }
}
