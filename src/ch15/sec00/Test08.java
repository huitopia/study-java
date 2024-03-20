package ch15.sec00;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) {
        Set<Student08> set = new HashSet<>();
        set.add(new Student08(1, "홍길동"));
        set.add(new Student08(2, "전우치"));
        set.add(new Student08(1, "손오공"));

        System.out.println("set.size() = " + set.size());
        for (Student08 s : set) {
            System.out.println("Info : " + s.studentNum + ", " + s.name);
        }
    }
}

class Student08 {
    public int studentNum;
    public String name;

    public Student08(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    // 학번이 같으면 동일한 Student 로 중복 저장 막기
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student08 student08 = (Student08) o;
        return studentNum == student08.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}