package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student student1 = new Student(1, "김가네");
        Student student2 = new Student(1, "김가네");
        // 해시코드가 동일한지 검사
        if (student1.hashCode() == student2.hashCode()) {
            // 데이터가 동일한지 검사
            if (student1.equals(student2)) {
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 달라 동등 객체가 아닙니다.");
            }
        } else {
            System.out.println("해시코드가 달라 동등 객체가 아닙니다.");
        }
    }
}
