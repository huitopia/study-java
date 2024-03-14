package ch16.sec05.exam03;

public class Person {
    public Member getMember1(Createable1 createable) {
        String id = "winter";
        Member member = createable.create(id);
        return member;
    }

    public Member getMember2(Createable2 createable) {
        String id = "winter";
        String name = "겨울";
        Member member = createable.create(id, name);
        return member;
    }
}
