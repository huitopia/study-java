package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button(); // 객체 생성
        // 클릭 이벤트 처리할 구현 클래스
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭했다.");
            }
        }
        button.setClickListener(new OkListener()); // 구현 객체 주입
        button.click(); // 버튼 클릭
        Button btnCancel = new Button(); // 객체 생성
        // cancel 클릭 이벤트 처리할 구현 클래스
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭했다.");
            }
        }
        btnCancel.setClickListener(new CancelListener()); // 구현 객체 주입
        btnCancel.click(); // 버튼 클릭
    }
}
