package ch04.sec02;

import java.util.Random;

public class IfNestedExample2 {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(81, 101);
        System.out.println("score = " + score);
        String grade = "";
        if (score >= 90) {
            grade = (score >= 95) ? "A+" : "A";
        } else {
            grade = (score >= 85) ? "B+" : "B";
        }
        System.out.println("grade = " + grade);
    }
}
