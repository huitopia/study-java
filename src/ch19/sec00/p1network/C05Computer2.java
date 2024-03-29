package ch19.sec00.p1network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C05Computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.73", 9000);
        try (socket) {
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            try (scanner; os; osw; bw; pw) {
                while (true) {
                    System.out.println("입력>");
                    String message = scanner.nextLine();
                    pw.println(message);
                    pw.flush();
                    if (message.equals("bye")) {
                        break;
                    }
                }
            }
        }

    }
}
