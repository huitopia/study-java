package ch05.sec13;

public class Test08 {
    public static void main(String[] args) {
        //  전체 합, 평균
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalStudent = 0;
        int totalSum = 0;

        for (int i = 0; i < array.length; i++) {
            totalStudent += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
            }
        }
        System.out.println("totalStudent = " + totalStudent); // 10
        System.out.println("totalSum = " + totalSum); // 881

        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("totalAvg = " + totalAvg); // 88.1
    }
}
