package ch18.sec00.p2inputStream;

import java.io.*;

public class C06CopyFile {
    public static void main(String[] args) {
        String src = "temp/dog.png";
        String des = "temp/dog-copy.png";

        try {
            InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);

            byte[] data = new byte[1024];
            int len = 0;
            while ((len = is.read(data)) != -1) {
                os.write(data, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
