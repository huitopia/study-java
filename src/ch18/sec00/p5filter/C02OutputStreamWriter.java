package ch18.sec00.p5filter;

import java.io.*;

public class C02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output2.txt";
        OutputStream os = new FileOutputStream(file);
        char c1 = 'A';
        char c2 = '가';
        os.write(c1); // A
        os.write(c2); //  
//        os.close(); // IOException :  Stream Closed
        Writer writer = new OutputStreamWriter(os);
        writer.write(c2); // 가
        writer.flush();
        writer.close();
    }
}
