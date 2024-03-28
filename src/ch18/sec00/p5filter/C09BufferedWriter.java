package ch18.sec00.p5filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C09BufferedWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output9.txt";
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 5; i++) {
            bw.write("hello word!");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println("출력 완료");
    }
}
