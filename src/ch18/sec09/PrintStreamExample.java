package ch18.sec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.print("마치 ");
        ps.println("프린터가 출력하는 것처럼 ");
        ps.println("데이터를 출력합니다.");
        ps.printf("| %6d | %-10s | %10s | \n", 1, "hong", "job1");
        ps.printf("| %6d | %-10s | %10s | \n", 2, "kam", "job2");
        ps.flush();
        ps.close();
    }
}
