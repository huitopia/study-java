package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //  정사각형
        double result1 = cal.areaRectangle(10);
        //  직사각형
        double result2 = cal.areaRectangle(10, 20);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
