package ch09.sec06.exam03;

public class Button {
    public static interface ClickListener { // 정적멤버 인터페이스
        void onClick(); // 추상 메소드
    }

    private ClickListener clickListener; // 필드

    public void setClickListener(ClickListener clickListener) { // 메소드
        this.clickListener = clickListener;
    }

    public void click() { // Button이 클릭되었을 때 실행하는 메소드 선언
        this.clickListener.onClick();
    }
}
