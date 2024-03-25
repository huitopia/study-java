package ch11.sec00.p3custom;

public class C01Custom {
    public static void main(String[] args) {
        someMethod01();
    }

    public static void someMethod01() {
        throw new RuntimeException("잘못된 접근");
    }
}
