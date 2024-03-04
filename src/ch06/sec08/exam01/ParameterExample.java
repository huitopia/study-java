package ch06.sec08.exam01;

public class ParameterExample {
    public static void main(String[] args) {
        Parameter myPara = new Parameter();

        myPara.printSum(1, 5);
        myPara.printDivide(9.0, 3);
        myPara.printDivide(10, 2);
    }

}

class Parameter {
    int printSum(int x, int y) {
        int result = x + y;
        System.out.println("result = " + result);
        return result;
    }

    double printDivide(double x, double y) {
        double result = x / y;
        System.out.println("result = " + result);
        return result;
    }
}
