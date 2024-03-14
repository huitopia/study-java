package ch12.sec00;

import java.util.Objects;

public class HashCode07 {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07("이것이 자바다");
        MyClass07 o2 = new MyClass07("이것이 자바다");
        MyClass07 o3 = new MyClass07("스프링 부트3");

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.equals(o3));
        System.out.println(o3.hashCode());

    }


}

class MyClass07 {
    private String title;

    public MyClass07(String title) {
        this.title = title;
    }
    // hashcode 재정의
    // 1. 같은 객체가 hashCode를 여러번 호출해도 같은 값이 나와야함
    // 2. 두 객체가 equals로 같은 객체로 여겨지면 두 객체의 hashCode는 같아야한다.
    // 3. 두 객체가 equals로 같지 않더라도 두 객체의 hashcode는 같을 수도 있다.(하지만 다르면 더 좋음)


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true; // 객체의 자기 자신과 참조값이 같으면 true
//        if (o == null || getClass() != o.getClass())
//            return false; // 객체가 들어왔을 때 null 이면 false, 객체의 타입과 코드 객체의 타입이 다르면 false
//        MyClass07 myClass07 = (MyClass07) o; // 형변환
//        return Objects.equals(title, myClass07.title); // Object의 동일 메소드를 파악해서 자기 객체와 넘어온 객체의 타이틀이 같은지 비교(두 String이 같으면 같은것)
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title);
//        // return title != null ? title.hashCode.
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass07 myClass07 = (MyClass07) o;

        return Objects.equals(title, myClass07.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
