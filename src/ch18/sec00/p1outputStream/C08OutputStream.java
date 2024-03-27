package ch18.sec00.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C08OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output8.data";
        try {
            OutputStream os = new FileOutputStream(fileName);
            os.write(23074);
            os.write(29234);
            byte[] data = new byte[10];
            os.write(data);
            os.write(data);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
