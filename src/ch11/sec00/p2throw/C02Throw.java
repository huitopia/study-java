package ch11.sec00.p2throw;

public class C02Throw {
    public static void main(String[] args) {
        try {
            someMethod01();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("program End");
    }

    public static void someMethod01() {
        RuntimeException e = new RuntimeException();
        throw e;
        // throw new RuntimeException();
    }
}
