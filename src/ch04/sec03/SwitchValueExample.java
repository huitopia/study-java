package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //  Java 12부터 가능
        int score = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                //  Java 13부터 가능
                yield result;
            }
            default -> 60;
        };
        System.out.println("score = " + score);
        ;
    }
}
