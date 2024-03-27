package ch18.sec00.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03Close {
    public static void main(String[] args) throws IOException {
        String file = "temp/output3.data";
        OutputStream os = null;
        os = new FileOutputStream(file);
        os.write(298374);
        os.close();
    }
}
