package ch19.sec03.exam01;

import java.io.IOException;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("client start");

            // socket end
            socket.close();
            System.out.println("client end");
        } catch (IOException e) { // 해당 포트에 연결 불가
            System.out.println(e.getMessage());
        }
    }
}
