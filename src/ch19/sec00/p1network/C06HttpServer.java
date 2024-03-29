package ch19.sec00.p1network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C06HttpServer {
    public static void main(String[] args) {
        try {
            // request
            ServerSocket serverSocket = new ServerSocket(9000);
            Socket socket = serverSocket.accept();
            try (socket) {

                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                try (is; isr; br;) {
                    while (true) {
                        String line = br.readLine();
                        System.out.println("line = " + line);
                        if (line.isBlank()) {
                            break;
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
