package ch07.sec03.exam01;

public class Iphone extends Phone {
    // 자식 생성자 선언
    public Iphone(String brand, String color) {
        super();
        this.brand = brand;
        this.color = color;
        System.out.println("Iphone(String brand, String color) 생성자 실행");
    }
}
