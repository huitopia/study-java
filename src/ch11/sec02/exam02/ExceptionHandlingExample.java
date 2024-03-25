package ch11.sec02.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // ClassPath 위치에 주어진 클래스를 찾지 못할 경우 예외 발생
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
