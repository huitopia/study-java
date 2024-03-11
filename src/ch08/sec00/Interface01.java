package ch08.sec00;

public class Interface01 {
    public static void main(String[] args) {
        ConcreteClass01 cc = new ConcreteClass01();
        MyInterface01 mi = cc;
    }
}

interface MyInterface01 {

}

class ConcreteClass01 implements MyInterface01 {

}
