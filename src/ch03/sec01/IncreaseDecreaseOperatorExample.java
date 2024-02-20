package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // x = 11
        ++x; // x = 12
        System.out.println("x=" + x); // x = 12

        y--; // y = 9
        --y; // 7 =8
        System.out.println("y=" + y); // y = 8

        // 증감 연산자가 뒤에 있어 대입 먼저 되고 x++ 됨
        z = x++;
        System.out.println("z=" + z); // z = 12
        System.out.println("x=" + x); // x = 13

        z = ++x;
        System.out.println("z=" + z); // z = 14
        System.out.println("x=" + x); // x = 14

        // y의 증감 연산자가 뒤에 있어 대입과 +연산 후 y++됨
        z = ++x + y++;
        System.out.println("z=" + z); // 15 + 8
        System.out.println("x=" + x); // 15
        System.out.println("y=" + y); // 9
    }
}
