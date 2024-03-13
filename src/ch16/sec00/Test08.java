package ch16.sec00;

import java.util.Arrays;

public class Test08 {
    private static Student[] students = {
            new Student("가가가", 90, 96),
            new Student("나나나", 95, 93)
    };

    public static double avg(Function01<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        double avg = (double) sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("englishAvg = " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("mathAvg = " + mathAvg);
    }

}

@FunctionalInterface
interface Function01<T> {
    double apply(T t);
}

class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
