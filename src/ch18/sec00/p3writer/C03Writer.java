package ch18.sec00.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C03Writer {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("temp/output3.txt");
            try (writer) {

                writer.write(44146);
                writer.write('가');
                writer.write(new char[]{'가', '나', '다'});
                writer.write("hello world!");
                writer.write("⌚️ apple watch");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
