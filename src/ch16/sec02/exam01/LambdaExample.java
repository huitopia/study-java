package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        // 실행문이 한 개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("LambdaExample.main"));

    }
}

@FunctionalInterface
interface Workable {
    void work();
}

class Person {
    void action(Workable workable) {
        workable.work();
    }
}
