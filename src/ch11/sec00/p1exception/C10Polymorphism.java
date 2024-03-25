package ch11.sec00.p1exception;

import java.util.List;

public class C10Polymorphism {
    public static void main(String[] args) {
        // catch block 동시 실행 X
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
