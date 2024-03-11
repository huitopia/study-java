package ch08.sec07;

public interface Service {
    // 디폴트 메소드
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod1");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2");
        defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("defaultMethod 중복 A");
        System.out.println("defaultMethod 중복 B");
    }

    // 정적 메소드
    static void staticMethod01() {
        System.out.println("Service.staticMethod01");
        staticCommon();
    }

    static void staticMethod02() {
        System.out.println("Service.staticMethod02");
        staticCommon();
    }

    // private 메소드
    private static void staticCommon() {
        System.out.println("staticMethod 중복 C");
        System.out.println("staticMethod 중복 D");
    }
}
