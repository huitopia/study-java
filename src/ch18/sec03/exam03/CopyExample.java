package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws IOException {
        String originalFileName = "temp/bee.png";
        String targetFileName = "temp/bee2.png";
        // 입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);
        // 8bit == 1byte
        byte[] data = new byte[1024]; // 읽은 바이트를 저장할 배열 생성
        while (true) {
            int num = is.read(data); // 최대 1024 바이트를 읽고 배열에 저장하고 읽은 바이트는 반환
            if (num == -1) break; // 파일을 다 읽으면 while 문 종료
            os.write(data, 0, num); // 읽은 바이트 수만큼 출력
        }

        os.flush(); // 내부 버퍼 잔류 바이트를 출력하고 버퍼 비움
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
