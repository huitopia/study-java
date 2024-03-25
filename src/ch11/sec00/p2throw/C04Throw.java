package ch11.sec00.p2throw;

public class C04Throw {
    public static void main(String[] args) {
        try {
            method01();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }

    public static void method01() throws ReflectiveOperationException {
        throw new ClassCastException();
    }
}
