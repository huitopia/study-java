package ch05.sec05;

public class SubstringExample {
    public static void main(String[] args) {
        String ssn = "990108-1234567";
        String first = ssn.substring(0, 6);
        String second = ssn.substring(7);
        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}
