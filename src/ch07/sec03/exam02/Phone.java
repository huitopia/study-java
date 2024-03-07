package ch07.sec03.exam02;

public class Phone {
    public String brand;
    public String color;

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
