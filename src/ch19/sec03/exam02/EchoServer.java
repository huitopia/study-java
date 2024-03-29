package ch19.sec03.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("server end q or Q + Enter");
        System.out.println("-------------------------");
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }
        scanner.close();
        stopServer();
    }


    private static void startServer() {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[server] start");

                    while (true) {
                        System.out.println("[server] wait");
                        Socket socket = serverSocket.accept();

                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[server] " + isa.getHostName() + " connection request ok");

                        InputStream is = socket.getInputStream();
                        byte[] data = new byte[1024];
                        int readByteCount = is.read(data);
                        String message = new String(data, 0, readByteCount, "UTF-8");

                        OutputStream os = socket.getOutputStream();
                        data = message.getBytes("UTF-8");
                        os.write(data);
                        os.flush();
                        System.out.println("[server] get data re-send: " + message);

                        socket.close();
                        System.out.println("[server] " + isa.getHostName() + " disconnected");
                    }
                } catch (IOException e) {
                    System.out.println("[server] " + e.getMessage());
                }
            }
        };
        t.start();
    }

    private static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[server] end");
        } catch (IOException e) {
            System.out.println("[server] " + e.getMessage());
        }
    }
}
