package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        try {
            // 문자 기반 출력 스트림 생성
            Writer writer = new FileWriter("temp/test.txt");

            char a = 'A';
            char b = 'B';

            char[] arr = {'C', 'D', 'E'}; // 배열 출력

            writer.write(a);
            writer.write(b);
            writer.write(arr);
            writer.write("FGH"); // 문자열 출력
            writer.flush(); // 버퍼에 잔류하고 있는 문자 출력 후, 버퍼 비움 (stream : 물결 / flush : 흘러 보냄)
            writer.close(); // 출력 스트림을 닫고 메모리 해제

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
