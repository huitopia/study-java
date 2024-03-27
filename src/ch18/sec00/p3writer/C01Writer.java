package ch18.sec00.p3writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {
        /*
         * 문자 단위 출력 스트림
         * OutputStream : 바이트 단위 출력 스트림 -> 영어만 됨
         * Writer : 문자 단위 출력 스트림 -> 문자 단위라 한글도 가능(깨질 수 있음)
         */

        String file1 = "temp/output1.txt";

        try (OutputStream os = new FileOutputStream(file1)) {
            os.write(100); // d
            os.write(44145); // 한글 단위 출력 X
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
