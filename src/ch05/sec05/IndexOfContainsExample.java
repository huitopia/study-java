package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println("location = " + location);

        String substring = subject.substring(location);
        System.out.println("substring = " + substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바 단어 포함");
        } else {
            System.out.println("자바 단어 미포함");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바 포함");
        } else {
            System.out.println("자바 미포함");
        }

    }
}
