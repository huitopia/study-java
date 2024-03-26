package ch18.sec00.p1outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws Exception {
        String fileName = "temp/output2.data";
        OutputStream os = new FileOutputStream(fileName);
        os.write(28374);
        os.write(923482394);
        System.out.println("1차");
        Thread.sleep(10_000);
        os.write(935445);
        os.write(23425);
        System.out.println("2차");
        os.flush(); // 아직 스트림에 출력되지 않은 데이터들을 강제 출력
        os.close();

    }
}
