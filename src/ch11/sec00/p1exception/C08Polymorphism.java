package ch11.sec00.p1exception;

import java.util.List;

public class C08Polymorphism {
    public static void main(String[] args) {
        try {
            List.of().get(0); // exception
            System.out.println("try block code");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("catch block code");
            System.err.println(e.getMessage());
        }
        System.out.println("End");

    }
}
