package ch18.sec00.p5filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class C11PrintStream {
    public static void main(String[] args) throws IOException {
        String file = "temp/output11.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        ps.print("hello wold!");
        ps.print("😇");
        ps.println();
        ps.println("lunch time");
        ps.println("hungry");
        ps.printf("%s?%s?", "rice", "beef");
        ps.close();
    }
}
