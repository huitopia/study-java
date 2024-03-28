package ch18.sec00.p6file;

import java.io.File;

public class C04Directory {
    public static void main(String[] args) {
        String path = "temp/folder2/sub1/sub2"; // 여러개 폴더
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); // false

        if (!file.exists()) {
            file.mkdirs(); // 상위 directory 한 번에 생성
        }

        System.out.println("file.exists() = " + file.exists()); // true
        System.out.println("file.isDirectory() = " + file.isDirectory()); // true
    }
}
