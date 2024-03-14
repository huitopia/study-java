package ch12.sec03.exam02;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    // 재정의 동등 객체로 만들어줌
    @Override
    /*
     * Object의 equals() 메소드를 재정의해서 Student 객체인지 확인
     * 학생 번호와 이름이 같으면 true 리턴
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    /*
     * Object의 hashCode 메소드 재정의
     * 학생번호와 이름 해시코드를 합한 새로운 해시코드를 리턴(번호와 이름이 같으면 동일한 해시코드 생성)
     */
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
