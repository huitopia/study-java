package ch19.sec03.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[clinet] connection successful");

            String sendMessage = "message!!!!!!!";
            OutputStream os = socket.getOutputStream();
            byte[] data = sendMessage.getBytes("UTF-8");
            os.write(data);
            os.flush();
            System.out.println("[client] send data : " + sendMessage);

            InputStream is = socket.getInputStream();
            data = new byte[1024];
            int readByteCount = is.read(data);
            String receiveMessage = new String(data, 0, readByteCount, "UTF-8");
            System.out.println("[client] receive data : " + receiveMessage);

            socket.close();
            System.out.println("[client] disconnected");
        } catch (IOException e) {
            System.out.println("[client] " + e.getMessage());
        }
    }
}
