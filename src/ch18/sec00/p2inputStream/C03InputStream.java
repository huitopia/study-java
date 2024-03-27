package ch18.sec00.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data"; // 24byte
        try {
            InputStream is = new FileInputStream(fileName);
            int data = is.read();
            byte[] b = new byte[10];
            int len1 = is.read(b);
            int len2 = is.read(b);
            int len3 = is.read(b);
            int len4 = is.read(b);
            is.close();
            System.out.println("len1 = " + len1); // 10byte
            System.out.println("len2 = " + len2); // 10byte
            System.out.println("len3 = " + len3); // 4byte
            System.out.println("len4 = " + len4); // -1

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
