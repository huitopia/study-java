package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;
            // 텍스트 파일로부터 문자 입력 스트림
            reader = new FileReader("temp/test.txt");
            while (true) {
                // 1 문자를 읽음
                int data = reader.read();
                // 파일을 다 읽으면 while 문 종료
                if (data == -1) break;
                // 읽은 문자 출력
                System.out.print((char) data);
            }
            reader.close();
            System.out.println();
            // 텍스트 파일로부터 문자 입력 스트림
            reader = new FileReader("temp/test.txt");
            // 읽은 문자를 저장할 배열 생성
            char[] data2 = new char[100];
            while (true) {
                // 읽은 문자는 배열에 저장, 읽은 문자 수는 리턴
                int num = reader.read(data2);
                // 파일을 다 읽으면 while 문 종료
                if (num == -1) break;
                for (int i = 0; i < num; i++) { // 읽은 문자 수만큼 출력
                    System.out.print(data2[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
