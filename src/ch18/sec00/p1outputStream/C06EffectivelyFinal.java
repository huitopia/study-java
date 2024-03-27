package ch18.sec00.p1outputStream;

import java.io.*;

public class C06EffectivelyFinal {
    public static void main(String[] args) {
        String inputFileName = "temp/input5.data";
        String outputFileName = "temp/output5.data";
        try (
                InputStream is = new FileInputStream(inputFileName);
                OutputStream os = new FileOutputStream(outputFileName);
        ) {
            is.read();
            os.write(29834);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
