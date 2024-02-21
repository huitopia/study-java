package ch03.sec09;

public class BitShiftExample2 {
    public static void main(String[] args) {
        /*
         *  00000000 = 0
         *  00000000 = 0
         *  00000011 = 3
         *  00000100 = 4
         */
        int val = 772;

        byte byte1 = (byte) (val >> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값 : " + int1); // 0

        byte byt2 = (byte) (val >> 16);
        int int2 = Byte.toUnsignedInt(byt2);
        System.out.println("두 번째 바이트 부호 없는 값 : " + int2); // 0

        byte byte3 = (byte) (val >>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값 : " + int3); // 3

        byte byte4 = (byte) val;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값 : " + int4); // 4
    }
}
