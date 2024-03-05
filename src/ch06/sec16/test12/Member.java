package ch06.sec16.test12;

public class Member {
    String name;
    String id;
    String password;
    int age;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("이름 : " + name);
        System.out.println("id : " + id);
    }
}
