package ch09.sec00;

public class EffectivelyFinal05 {
    void method(int param) { // 내부에서 사용시 final or effectively final
        int i = 3; // final or effectively final
        class LocalClass {
            void method() {
                System.out.println("i = " + i);
                System.out.println("param = " + param);
            }
        }
    }
}
