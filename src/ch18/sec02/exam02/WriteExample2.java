package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("temp/test3.db");
        byte[] arr = {10, 20, 30, 40, 50};
        // arr index 1번부터 3개만 출력
        os.write(arr, 1, 3);
        os.flush();
        os.close();
    }
}
