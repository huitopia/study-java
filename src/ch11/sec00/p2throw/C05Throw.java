package ch11.sec00.p2throw;

public class C05Throw {
    public static void main(String[] args) {
        try {
            someMethod03();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void someMethod03() throws ClassNotFoundException {
        someMethod02();
    }

    public static void someMethod02() throws ClassNotFoundException {
        someMethod01();
    }

    public static void someMethod01() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
