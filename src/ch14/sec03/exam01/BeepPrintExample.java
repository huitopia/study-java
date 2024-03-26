package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        // Toolkit 객체 얻기
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            // 비프음 발생
            toolkit.beep();
            try {
                Thread.sleep(500); // 0.5 초간 일시 정지
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
