package ch18.sec00.p5filter;

import java.io.*;

public class C04BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "temp/bigfile/output2.data";
        OutputStream os = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] data = new byte[10];
        // 시작 시간
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);
        for (int i = 0; i < (1024 * 1024 * 100); i++) {
            bos.write(data);
        }
        bos.flush();
        bos.close();
        long end = System.currentTimeMillis(); // 종료 시간
        long time = end - start;
        System.out.println("time = " + time);
    }
}
