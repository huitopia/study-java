package ch18.sec00.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {
        /*
         * InputStream : 바이트 단위 입력 스트림
         * Reader : 문자 단위 입력 스트림
         */
        Reader reader = new FileReader("temp/output2.txt");
        // 읽은 문자 하나(2byte) return
        // 💡2byte 지만 0000으로 채워서 4byte return
        int read1 = reader.read();
        int read2 = reader.read();
        int read3 = reader.read();
        int read4 = reader.read();
        System.out.println("read1 = " + (char) read1);
        System.out.println("read2 = " + (char) read2);
        System.out.println("read3 = " + (char) read3);
        System.out.println("read4 = " + (char) read4); // a
        System.out.println("read4 = " + read4); // 97
    }
}
