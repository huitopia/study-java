package ch18.sec00.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C04InputStream {
    public static void main(String[] args) {
        String file = "temp/output8.data";
        try {
            InputStream is = new FileInputStream(file);
            byte[] data = new byte[10];
            int len = 0;
            while ((len = is.read(data)) != -1) {
                System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
