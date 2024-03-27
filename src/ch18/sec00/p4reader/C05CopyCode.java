package ch18.sec00.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) throws IOException {
        /*
         * C05CopyCode.java 파일을 temp/C05CopyCode.txt 파일로 복사 코드 완성
         * Reader, Writer 사용
         */
        String src = "src/ch18/sec00/p4reader/C05CopyCode.java";
        String file = "temp/C05CopyCode.txt";

        Reader reader = new FileReader(src);
        Writer writer = new FileWriter(file);
        char[] data = new char[50];
        int len = 0;
        while ((len = reader.read(data)) != -1) {
            writer.write(data, 0, len);
        }
        reader.close();
        writer.close();
    }
}
