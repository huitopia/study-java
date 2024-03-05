package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호와 이름 전달
        Korean ko = new Korean("123456-1234123", "이름");

        System.out.println(ko.nation);
        System.out.println(ko.name);
        System.out.println(ko.ssn);

        ko.name = "이름2"; // final 아니라 값 변경 가능
    }
}
