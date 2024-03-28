package ch18.sec11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        // File 객체 생성
        File dir = new File("temp/images");
        File file1 = new File("temp/file1");
        File file2 = new File("temp/file2");
        File file3 = new File("temp/file3");
        // 존재하지 않으면 디렉토리 또는 파일 생성
        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file3.exists()) {
            file3.createNewFile();
        }
        // temp 폴더의 내용을 출력
        File temp = new File("temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            System.out.printf("%-25s", simpleDateFormat.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }

    }
}
