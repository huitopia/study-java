package ch18.sec00.p2inputStream;

import java.io.*;

public class C05CopyFile {
    public static void main(String[] args) {
        String inputFileName = "temp/output9.data";
        String outputFileName = "temp/output9.copy";

        try {
            InputStream is = new FileInputStream(inputFileName);
            OutputStream os = new FileOutputStream(outputFileName);

            byte[] data = new byte[10];
            int len = 0;
            while ((len = is.read(data)) != -1) {
                os.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
