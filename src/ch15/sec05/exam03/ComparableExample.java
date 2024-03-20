package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("이름1", 24));
        treeSet.add(new Person("이름2", 14));
        treeSet.add(new Person("이름3", 34));

        for (Person person : treeSet) {
            System.out.println(person.getName() + ": " + person.getAge());
        }

        System.out.println("treeSet = " + treeSet);
    }
}
