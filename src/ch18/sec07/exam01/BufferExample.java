package ch18.sec07.exam01;

import javax.swing.*;
import java.io.*;
import java.nio.Buffer;

public class BufferExample {
    public static void main(String[] args) throws IOException {
        String original = BufferExample.class.getResource("originalFile1.jpg").getPath();
        String target = "temp/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(original);
        FileOutputStream fos = new FileOutputStream(target);

        String original2 = BufferExample.class.getResource("originalFile1.jpg").getPath();
        String target2 = "temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(original2);
        FileOutputStream fos2 = new FileOutputStream(target2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("Buffer X : " + nonBufferTime);

        long bufferTime = copy(bis, bos);
        System.out.println("Buffer O : " + bufferTime);

        fis.close();
        fos.close();
        bis.close();
        bos.close();

    }

    private static long copy(InputStream is, OutputStream os) throws IOException {
        long start = System.nanoTime();
        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}
