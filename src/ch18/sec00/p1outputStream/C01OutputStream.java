package ch18.sec00.p1outputStream;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01OutputStream {
    /*
     * InputStream : 프로그램 외부 입력을 Byte 단위로 받기 위한 객체의 클래스
     * OutputStream : 프로그램 외부 출력을 Byte 단위로 받기 위한 객체의 클래스
     * 두 Stream 을 구현한 클래스는 뒤에 InputStream, OutputStream 명시되어 있다.
     *
     * Reader : 문자단위 입력 스트림
     * Writer : 문자단위 출력 스트림
     */
    public static void main(String[] args) throws Exception {
        String fileName = "temp/output01.data";
        OutputStream os = new FileOutputStream(fileName);
        os.write(99);
        os.write(100);
        os.write(1000000000);
    }
}
