package ch18.sec00.p1outputStream;

import java.io.*;

public class C09OutputStream {
    public static void main(String[] args) {
        String file = "temp/output9.data";
        try {
            OutputStream os = new FileOutputStream(file);
            os.write(23434);
            byte[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 100};
            os.write(data);
            os.write(data, 0, 10);
            os.write(data, 5, 3);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
