package ch08.sec00;

public class Method01 {
    public static void main(String[] args) {
        Pet03 pet03 = new Cat03();
        Pet03 pet03_1 = new GoldFist03();

        pet03.feed(); // 인터페이스 메소드 실행
        pet03_1.feed(); // 인터페이스 메소드 실행

        Cat03 cat03 = new Cat03();
        cat03.feed();
    }

}

// formatter:off
interface Pet03 {
    //인터페이스의 메소드듣 모두 추상 메소드 => 중괄호 적용 x
    //public, abstract 생략 가능
    void feed();
}

abstract class Animal03 {
    // 추상 메소드를 보유하면 클래스도 추상 클래스여야 한다.
    abstract public void breathe();
}

class Cat03 extends Animal03 implements Pet03 {
    @Override
    public void breathe() {
        System.out.println("cat breathe");
    }

    @Override
    public void feed() {
        System.out.println("cat feed");
    }
}

class Tiger03 extends Animal03 {
    @Override
    public void breathe() {
        System.out.println("tiger breathe");

    }
}

class GoldFist03 extends Animal03 implements Pet03 {
    @Override
    public void breathe() {
        System.out.println("goldFist breathe");
    }

    @Override
    public void feed() {
        System.out.println("goldFish feed");
    }
}
