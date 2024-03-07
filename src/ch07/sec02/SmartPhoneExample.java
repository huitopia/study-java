package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // 객체 생성
        SmartPhone mySmartPhone = new SmartPhone("iphone", "black");
        // Phone으로 상속받은 필드 읽기
        System.out.println("mySmartPhone.model = " + mySmartPhone.model); // iphone
        System.out.println("mySmartPhone.color = " + mySmartPhone.color); // black
        // SmartPhone의 필드 읽기
        System.out.println("mySmartPhone.wifi = " + mySmartPhone.wifi); // false => boolean의 초기값은 false
        // Phone 상속받은 메소드 호출
        mySmartPhone.bell();
        mySmartPhone.sendVoice("hello");
        mySmartPhone.receiveVoice("hi");
        mySmartPhone.sendVoice("who?");
        mySmartPhone.hangUp();
        // SmartPhone의 메소드 호출
        mySmartPhone.setWifi(true);
        mySmartPhone.internet();
    }
}
