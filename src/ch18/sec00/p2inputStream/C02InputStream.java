package ch18.sec00.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C02InputStream {
    public static void main(String[] args) {
        String file = "temp/test3.db";
        try (
                InputStream is = new FileInputStream(file);
        ) {
            int data = 0;
            // 반복문으로 test3.db data 추출
            // 남은 데이터가 없으면 -1 반환하여 -1로 while 벗어나오는 장치 설정
            while ((data = is.read()) != -1) {
                System.out.println("data = " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
