package ch06.sec10.exam02;

public class Television {
    static String company = "My Company"; // 선언 시 초기값
    static String model = "LCD"; // 선언 시 초기값
    static String info; // 정적 블록

    static {
        info = company + " - " + model;
    }
}
