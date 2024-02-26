package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        //  배열 항목 초기값 출력
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("[i][j] = " + i + j + mathScores[i][j]);
            }
        }
        System.out.println();
        //  배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        //  전체 학생의 수학 평균 구하기
        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalSum += mathScores[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("totalStudent = " + totalStudent);
        System.out.println("totalAvg = " + totalAvg);

        // 각 반의 학생 수가 다를 경우 저장을 위한 2차원 배열 생성
        int[][] engScore = new int[2][];
        engScore[0] = new int[2];
        engScore[1] = new int[3];
        // 배열 항목 초기값 출력
        for (int i = 0; i < engScore.length; i++) {
            for (int j = 0; j < engScore[i].length; j++) {
                System.out.println("engScore = " + engScore[i][j]);
            }
        }
        // 배열 항목 값 변경
        engScore[0][0] = 90;
        engScore[0][1] = 91;
        engScore[1][0] = 92;
        engScore[1][1] = 93;
        engScore[1][2] = 94;
        //  전체 학생의 영어 평균 구하기
        totalStudent = 0;
        int totalEngSum = 0;
        for (int i = 0; i < engScore.length; i++) {
            totalStudent += engScore[i].length;
            for (int j = 0; j < engScore[i].length; j++) {
                totalEngSum += engScore[i][j];
            }
        }
        double totalEngAvg = (double) totalEngSum / totalStudent;
        System.out.println("totalEngAvg = " + totalEngAvg);

    }
}
