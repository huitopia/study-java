package ch19.sec03.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("서버 종료 q or Q -> Enter");
        System.out.println("-----------------------");
        // TCP server start
        startServer();
        // keyboard input
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }
        scanner.close();
        // TCP server end
        stopServer();
    }

    public static void startServer() {
        // 작업 스레드 정의
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("server start");
                    while (true) {
                        System.out.println("server request wait");
                        // accept: 연결 요청 수락을 위한 메소드로 클라이언트가 연결 요청하기 전까지 블로킹(실행 멈춤)
                        Socket socket = serverSocket.accept();
                        // 클라이언트의 IP 주소와 port 번호 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("server " + isa.getHostName() + "request OK");

                        socket.close();
                        System.out.println("server" + isa.getHostName() + "end");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("server end");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
