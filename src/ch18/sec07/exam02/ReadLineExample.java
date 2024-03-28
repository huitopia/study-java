package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) throws IOException {
        // FileReader 에 BufferedReader 보조 스트림 연결
        BufferedReader br = new BufferedReader(
                new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
        );
        int lineNo = 1;
        while (true) {
            // 1행 읽음
            String str = br.readLine();
            // 더 이상 읽을 내용 없으면 while 문 종료
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        // br 닫으면 연결된 FileReader 닫힘
        br.close();
    }
}
