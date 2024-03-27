package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws IOException {
        writer("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);

    }

    private static void writer(String str) throws IOException {
        // FileOutputStream 에 OutputStreamWriter 보조 스트림 연결
        OutputStream os = new FileOutputStream("temp/test.txt");
        Writer writer = new OutputStreamWriter(os);
        // OutputStreamWriter 보조 스트림을 이용해 문자 출력
        writer.write(str);
        writer.flush();
        writer.close();
    }

    private static String read() throws IOException {
        // FileInputStream 에 InputStreamReader 보조 스트림을 연결
        InputStream is = new FileInputStream("temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        // InputStreamReader 보조 스트림을 이용해서 문자 입력
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        // char 배열에서 읽은 문자 수만큼 문자열로 변환
        String str = new String(data, 0, num);
        return str;
    }
}
