package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("temp/test2.db");
        byte[] arr = {10, 20, 30};
        os.write(arr);
        os.flush();
        os.close();
        System.out.println("출력 성공");
    }
}
