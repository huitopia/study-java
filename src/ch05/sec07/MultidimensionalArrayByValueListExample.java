package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        //  2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("scores.length = " + scores.length);
        System.out.println("scores[0] = " + scores[0].length);
        System.out.println("scores[1] = " + scores[1].length);

        System.out.println("scores[0][2] = " + scores[0][2]);
        System.out.println("scores[1][1] = " + scores[1][1]);

        //  첫 번째 반의 평균 점수 구하기
        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("class1Avg = " + class1Avg);
        //  두 번째 반의 평균 점수 구하기
        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("class2Avg = " + class2Avg);

        // 전체 학생의 평균 점수 구하기
        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];
            }

        }
        double totalAvg = (double) totalSum / totalStudent;

        System.out.println("totalAvg = " + totalAvg);
    }
}
