package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        String name = "";
        if (name.equals("")) {
            System.out.println("name 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
