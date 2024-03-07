package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child child = new Child();
        child.method01();
        child.method02();
        child.method03();
        // 자동 타입 변환
        Parent parent = child;
        parent.method01();
        parent.method02();
//        parent.method03();
    }
}
