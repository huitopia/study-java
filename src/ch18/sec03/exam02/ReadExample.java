package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("temp/test2.db");
        byte[] data = new byte[100];
        while (true) {
            // 최대 100 byte 읽고, 읽은 byte 는 data 에 저장 후 읽은 수는 반환
            int num = is.read(data);
            if (num == -1) { // 파일 다 읽으면 num 은 -1이라 while 벗어남
                break;
            }
            for (int i = 0; i < num; i++) { // 읽은 byte 출력
                System.out.println("data[i] = " + data[i]);
            }
        }
        is.close(); // 배열의 모든 byte 출력
    }
}
