package ch11.sec00.p1exception;

import java.util.List;

public class C13MultiCatch {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
            Integer.parseInt("two");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception code1");
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception code2");
        } catch (Exception e) {
            System.out.println("Exception code3");
        }
    }
}
