package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        // 배열 항목 전체 합 구하기
        int sum = 0;
        for (int score : scores) {
            //  5개의 항목이 한 번씩 score 변수에 저장되고 sum에 누적됨
            sum = sum + score;
        }
        System.out.println("sum = " + sum);
        //  배열 항목 전체 평균 구하기
        double avg = (double) sum / scores.length;
        System.out.println("avg = " + avg);
    }
}
