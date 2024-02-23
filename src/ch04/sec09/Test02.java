package ch04.sec09;

public class Test02 {
    public static void main(String[] args) {
        String grade = "A";
        int score = switch (grade) {
            case "A" -> score = 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score = " + score);
    }
}
