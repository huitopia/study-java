package ch18.sec00.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04TryWithResources {
    public static void main(String[] args) {
        // close method 호출을 위한 코드를 줄이기 위한 문법
        String file = "temp/output4.data";
        try (OutputStream os = new FileOutputStream(file);) {
            os.write(203748);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
