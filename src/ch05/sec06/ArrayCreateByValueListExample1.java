package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("seasons[0] = " + seasons[0]);
        System.out.println("seasons[1] = " + seasons[1]);
        System.out.println("seasons[2] = " + seasons[2]);
        System.out.println("seasons[3] = " + seasons[3]);
        System.out.println();

        seasons[1] = "Hot";
        System.out.println("seasons[1] = " + seasons[1]);
        System.out.println();

        int sum = 0;
        int[] scores = {90, 94, 97};
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum = " + sum);

        double avg = (double) sum / 3;
        System.out.println("avg = " + avg);
    }
}
