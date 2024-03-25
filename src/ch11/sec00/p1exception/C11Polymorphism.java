package ch11.sec00.p1exception;

import java.util.List;

public class C11Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String2");
            List.of().get(0);
        } catch (ClassNotFoundException e) { // 하위가 밑에 쓰이면 error
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
