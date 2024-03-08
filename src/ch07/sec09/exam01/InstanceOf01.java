package ch07.sec09.exam01;

public class InstanceOf01 {
    public static void main(String[] args) {
        Tiger01 tiger01 = new Tiger01();
        Animal01 animal01 = tiger01;

        boolean b1 = animal01 instanceof Cat01;
        boolean b2 = animal01 instanceof Tiger01;
        boolean b3 = animal01 instanceof Animal01;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        // 자바 12 전
        if (animal01 instanceof Cat01) {
            Cat01 cat01 = (Cat01) animal01;
            cat01.meow();
        }
        // 자바 12 이후
//        if (animal01 instanceof Cat01 cat01) {
//            cat01.meow();
//        }
        System.out.println("프로그램 종료");
//        Cat01 cat01 = (Cat01) animal01;
    }
}

class Animal01 {

}

class Tiger01 extends Animal01 {
}

class Cat01 extends Animal01 {
    public void meow() {
        System.out.println("야옹");
    }
}
