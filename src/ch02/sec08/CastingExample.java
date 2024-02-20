package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println("var2 : " + var2); // 10

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println("var4 : " + var4); // 300

        double var5 = 32342342.14;
        int var6 = (int) var5;
        System.out.println("var8 : " + var6); // 32342342
    }
}
