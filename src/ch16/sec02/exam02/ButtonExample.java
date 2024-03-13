package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button(); // 객체 생성
        button.setClickListener(() -> { // 람다식 주입
            System.out.println("재생 버튼 클릭");
        });
//        button.click(); // 메소드 실행
        Button buttonCancel = new Button();
        buttonCancel.setClickListener(() -> {
            System.out.println("취소 버튼 클릭");
        });
//        buttonCancel.click();
    }
}

class Button {
    @FunctionalInterface
    static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
        clickListener.onClick();
    }

//    void click() {
//        this.clickListener.onClick();
//    }
}
