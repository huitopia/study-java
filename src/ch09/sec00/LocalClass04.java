package ch09.sec00;

public class LocalClass04 {
    void method01() {
        final int j = 5;
        class LocalClass01 {
            void method1() {
                int i = 0;
                System.out.println("i = " + i);
                i = 3;
                System.out.println("i = " + i);
                System.out.println("j = " + j); // 바깥 변수도 사용 가능하나 변경은 불가능하다.
            }
        }
    }
}
