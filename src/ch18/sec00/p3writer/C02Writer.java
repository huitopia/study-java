package ch18.sec00.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
    public static void main(String[] args) {
        // Writer : 문자 단위 출력 스트림
        String fileName = "temp/output2.txt";
        try {
            Writer writer = new FileWriter(fileName);
            // write : 주어진 16bit 높은 비트는 무시 4byte 중 2byte만 사용
            try (writer) {
                // 한글 3byte, 영어 1byte
                writer.write(44145); // 3byte
                writer.write('한'); // 3byte
                writer.write('ㄱ'); // 3byte
                writer.write('a'); // 1byte
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
