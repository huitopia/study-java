package ch18.sec00.p5filter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C07BufferedReader {
    public static void main(String[] args) throws IOException {

        String file = "src/ch18/sec00/p5filter/C07BufferedReader.java";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        // readLine() 한 줄씩 읽음
        String string1 = br.readLine();
        String string2 = br.readLine();
        String string3 = br.readLine();
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println("line = " + line);
        }

        br.close();
    }
}
