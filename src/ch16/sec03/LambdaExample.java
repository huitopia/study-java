package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        // 매개변수가 두 개일 경우
        person.action01((name, job) -> System.out.println(name + "의 직업은 " + job + "입니다.")); // 이름의 직업은 개발자입니다.
        person.action01((name, job) -> System.out.println(name + "은 " + job + "로 직군 전환했습니다.")); // 이름은 개발자로 직군 전환했습니다.
        // 매개변수가 한 개일 경우
        person.action02(content -> System.out.println(content + "이라 말합니다.")); // 안녕이라 말합니다.
        person.action02(content -> System.out.println(content + "이라 보냅니다.")); // 안녕이라 보냅니다.

        Workable workable = (a, b) -> {
            System.out.println(a + b);
        };
        workable.work("이이이름", "지지지직업"); // 이이이름지지지직업
    }
}

class Person {
    // Workable을 매개변수로 갖는 메소드
    void action01(Workable workable) {
        workable.work("이름", "개발자");
    }

    // Speakable을 매개변수로 갖는 메소드
    void action02(Speakable speakable) {
        speakable.speak("안녕");
    }
}

@FunctionalInterface
interface Workable {
    void work(String name, String job);
}

@FunctionalInterface
interface Speakable {
    void speak(String content);
}

