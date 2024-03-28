package ch18.sec00.p6file;

import java.io.File;

public class C03Directory {
    public static void main(String[] args) {
        String path = "temp/folder1";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); // false

        if (!file.exists()) { // 없으면 폴더 생성
            file.mkdir();
        }
        System.out.println("file.exists() = " + file.exists()); // true
    }
}
