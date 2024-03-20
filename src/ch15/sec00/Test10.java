package ch15.sec00;


import java.util.Objects;
import java.util.TreeSet;

public class Test10 {
    public static void main(String[] args) {
        TreeSet<Student10> treeSet = new TreeSet<Student10>();
        treeSet.add(new Student10("blue", 96));
        treeSet.add(new Student10("hong", 86));
        treeSet.add(new Student10("while", 92));

        Student10 student10 = treeSet.last();
        System.out.println("최고 점수 : " + student10.score);
        System.out.println("최고 점수를 받은 아이디 : " + student10.id);
    }
}

class Student10 implements Comparable<Student10> {
    public String id;
    public int score;

    public Student10(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student10{" +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student10 student10 = (Student10) o;
        return score == student10.score && Objects.equals(id, student10.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score);
    }

    @Override
    public int compareTo(Student10 o) {
        return this.score - o.score;
    }
}
