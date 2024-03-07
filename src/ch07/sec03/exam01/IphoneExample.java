package ch07.sec03.exam01;

public class IphoneExample {
    public static void main(String[] args) {
        // 객체 생성
        Iphone iphone = new Iphone("Apple", "blue");
        // Phone으로부터 상속 받은 필드 읽기
        System.out.println("iphone.brand = " + iphone.brand);
        System.out.println("iphone.color = " + iphone.color);
    }
}
