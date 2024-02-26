package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "Java");

        System.out.println("oldStr = " + oldStr);
        System.out.println("newStr = " + newStr);

        String testStr = "테스트 입니다. 테스트라구요.";
        testStr = testStr.replace("테스트", "test");
        System.out.println("testStr = " + testStr);
    }
}
