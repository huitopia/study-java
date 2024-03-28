package ch18.sec00.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
//        String fileName = "src/ch02/sec01/VariableUseExample.java";
        String fileName = "src/ch18/sec00/exam/Test07.java";
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            rowNumber++;
            if (rowData == null) break;
            System.out.println(rowNumber + ": " + rowData);
        }
        br.close();
    }
}
