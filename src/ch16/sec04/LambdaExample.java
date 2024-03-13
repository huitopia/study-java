package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        // 리턴문 두줄
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });
        // 리턴문 한줄
        person.action((x, y) -> x + y);
        // 메소드 호출
        person.action((x, y) -> sum(x, y));
    }

    private static double sum(double x, double y) {
        return x + y;
    }
}

@FunctionalInterface
interface Calculator {
    double calc(double x, double y);
}

class Person {
    void action(Calculator calculator) {
        double result = calculator.calc(30, 4);
        System.out.println("result = " + result);
    }
}
