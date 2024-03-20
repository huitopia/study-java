package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        HashSet hashSet = new HashSet();
        // HashSet에 Student 객체 생성
        Student student1 = new Student(1, "김가네");
        // HashSet에 Student 객체 저장
        hashSet.add(student1);
        System.out.println("저장된 객체 수 : " + hashSet.size()); // 1

        Student student2 = new Student(1, "김가네");
        hashSet.add(student2);
        System.out.println("저장된 객체 수 : " + hashSet.size()); // 1

        Student student3 = new Student(2, "김가네");
        hashSet.add(student3);
        System.out.println("저장된 객체 수 : " + hashSet.size()); // 2
    }
}
