package ch18.sec00.p5filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C10PrintWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output10.txt";
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.print("hello world");
        pw.print("➡️💡❓");
        pw.println();
        pw.println("곧 점심");
        pw.println("김밥 먹어야지");
        pw.printf("%s을 먹을까 %s를 먹을까?%n", "라면", "김밥");
        pw.close();
    }
}
