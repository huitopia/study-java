package ch18.sec00.p4reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C03Reader {
    public static void main(String[] args) throws IOException {
        String file = "temp/output3.txt";
        Reader reader = new FileReader(file);
        char[] data = new char[5];
        reader.read(data);
        System.out.println("reader = " + Arrays.toString(data));
        reader.read(data);
//        System.out.println("reader = " + Arrays.toString(data));
//        reader.read(data);
//        System.out.println("reader = " + Arrays.toString(data));
//        reader.read(data);

        int len1 = reader.read(data);
        int len2 = reader.read(data);
        int len3 = reader.read(data);
        System.out.println("len1 = " + len1);
        System.out.println("len2 = " + len2);
        System.out.println("len3 = " + len3);
        reader.close();
    }
}
