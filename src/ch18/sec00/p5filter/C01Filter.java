package ch18.sec00.p5filter;

import java.io.*;

public class C01Filter {
    public static void main(String[] args) throws IOException {
        /*
         * 어떤 I/O Stream -> 다른 I/O Stream 변경 후 사용 가능
         */
        String file = "temp/output3.txt";
        InputStream is = new FileInputStream(file);
//        int data1 = is.read();
//        System.out.println("data1 = " + (char) data1); // ê
        /* InputStream(byte Stream) -> InputStreamReader(character Stream) */
        Reader reader = new InputStreamReader(is);
        int data2 = reader.read(); // 1byte
        System.out.println("data2 = " + (char) data2); // 가

        is.close();
    }
}
