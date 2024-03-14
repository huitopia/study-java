package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("samsung", "android");
        System.out.println("smartPhone.toString() = " + smartPhone.toString());
        System.out.println("smartPhone = " + smartPhone);
        String strObj = smartPhone.toString();
        // 셋 다 동일 결과
        System.out.println("strObj = " + strObj);
    }
}
