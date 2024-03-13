package ch16.sec00;

public class Test7 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        System.out.println("result = " + result);
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(new Operator() {
            @Override
            public int apply(int x, int y) {
                if (x > y) {
                    return x;
                } else {
                    return y;
                }
            }
        });
        int min = maxOrMin(new Operator() {
            @Override
            public int apply(int x, int y) {
                if (x < y) {
                    return x;
                } else {
                    return y;
                }
            }
        });
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}

interface Operator {
    int apply(int x, int y);
}
