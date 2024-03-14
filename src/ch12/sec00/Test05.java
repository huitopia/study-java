package ch12.sec00;

import java.util.HashSet;
import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));
        // 동등 객체 지정 전 3, 지정 후 2
        System.out.println("저장된 Student 수: " + hashSet.size());

    }
}

class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }
    // code 입력

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}
