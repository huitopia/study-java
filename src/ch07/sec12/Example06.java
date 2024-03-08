package ch07.sec12;

public class Example06 {
    public static void main(String[] args) {

    }
}

class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    public int no;

    public Child(String name, int no) {
        super(name);
        this.no = no;
    }
}