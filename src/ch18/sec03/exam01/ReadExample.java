package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("temp/test1.db");
        while (true) {
            int data = is.read(); // 1byte 씩 읽기
            if (data == -1) {
                break;
            }
            System.out.println("data = " + data);
        }
        is.close(); //  입력 스트림을 닫고 사용 메모리 해제
    }
}
