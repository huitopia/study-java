package ch06.sec11.exam01;

public class Korean {
    // 인스턴스 final 필드 선언
    final String nation = "korea"; // 고정값으로 초기 대입
    final String ssn; // korean 생성시 부여됨
    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
