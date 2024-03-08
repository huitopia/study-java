package ch07.sec12.exam01;

import static java.lang.StringTemplate.STR;

public class Example01 {
    public static void main(String[] args) {
        Shape shape1 = new Round(3); // 반지름
        Shape shape2 = new Rectangle(5, 7); // 가로, 세로
        shape1.printArea(); // 원의 면적 출력
        shape2.printArea(); // 직사각형의 면적 출력

        printDesc(shape1); // 반지름이 3인 원의 면적은 ...
        printDesc(shape2); // 가로 5, 세로 7인 사각형의 면적은 ...
    }

    public static void printDesc(Object o) {
        System.out.println(o.toString());
    }
}

abstract class Shape {

    public abstract void printArea();
}

class Round extends Shape {
    double r;

    public Round(double r) {
        this.r = r;
    }

    @Override
    public void printArea() {
        double result = getResult();
        System.out.println(result);
    }

    @Override
    public String toString() {
        double result = getResult();
        return STR."반지름이 \{r}인 원의 면적은\{result} 입니다.";
    }

    private double getResult() {
        double result = r * 3.14;
        return result;
    }
}

class Rectangle extends Shape {
    double w;
    double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public void printArea() {
        double result = getResult();
        System.out.println(result);
    }

    @Override
    public String toString() {
        double result = getResult();
        return STR."가로 \{w}, 세로 \{h}인 사각형의 넓이는 \{result}입니다.";
    }

    private double getResult() {
        double result = w * h;
        return result;
    }
}

