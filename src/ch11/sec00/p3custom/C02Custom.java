package ch11.sec00.p3custom;

public class C02Custom {
    public static void main(String[] args) {
        try {
            method01();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method01() throws Exception {
        throw new Exception("시간 초과");
    }
}
