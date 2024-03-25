package ch11.sec00.p1exception;

public class C09Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
