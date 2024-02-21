package ch04.sec01;

public class MathRandomExample {
    public static void main(String[] args) {
//        주사위 1 ~ 6
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("num = " + num);

//        로또
        int number = (int) (Math.random() * 45) + 1;
        System.out.println("number = " + number);
    }
}
