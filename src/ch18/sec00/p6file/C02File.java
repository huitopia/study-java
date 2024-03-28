package ch18.sec00.p6file;

import java.io.File;
import java.io.IOException;

public class C02File {
    public static void main(String[] args) throws IOException {
        String path = "temp/output99.txt";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); // false

        if (!file.exists()) { // file 없으면 새 file 생성
            file.createNewFile();
        }

        System.out.println("file.exists() = " + file.exists()); // true
    }
}
