package ch18.sec00.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {
        String file = "temp/test3.db";
        try {
            InputStream is = new FileInputStream(file);
            int data1 = is.read();
            int data2 = is.read();
            int data3 = is.read();
            int data4 = is.read();
            System.out.println("data1 = " + data1);
            System.out.println("data2 = " + data2);
            System.out.println("data3 = " + data3);
            // 더 읽을 데이터가 없으면 -1 return
            System.out.println("data4 = " + data4);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
