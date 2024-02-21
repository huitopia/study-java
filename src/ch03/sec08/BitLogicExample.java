package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25)); // 9
        System.out.println("45 | 25 = " + (45 | 25)); // 61
        System.out.println("45 ^ 25 = " + (45 ^ 25)); // 52
//        System.out.println("~45 = " (~45));
        System.out.println("----------");

        byte receiveData = -120;

        int i1 = receiveData & 255;
        System.out.println("i1 = " + i1); // 136

        int i2 = Byte.toUnsignedInt(receiveData);
        System.out.println("i2 = " + i2); // 136

        int test = 136;
        byte test2 = (byte) test;
        System.out.println("test2 = " + test2); // -120

    }
}
