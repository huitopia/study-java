package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        for (float i = 0.1f; i <= 1.0f; i += 0.1f) {
            System.out.println("i = " + i);
        }
        // 0.1, 0.2, ... , 0.6, 0.70000005, 0.8000001, ...
    }
}
